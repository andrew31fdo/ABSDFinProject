/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import model.Make;
import model.VehicleModel;

/**
 *
 * @author Ronal
 */
public class Control extends HttpServlet {

    @PersistenceUnit(unitName = "")
    EntityManagerFactory emf;
    @Resource
    UserTransaction ut;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            EntityManager em = emf.createEntityManager();
            String module = request.getParameter("module");
            String action = request.getParameter("action");
            System.out.println("fff");
            System.out.println(module + "#" + action);
            if (module.equalsIgnoreCase("user") & action.equalsIgnoreCase("validate")) {
                //userValidation required...
                HttpSession session = request.getSession(true);
                String user = request.getParameter("username");
                session.setAttribute("user", user);
                String pass = request.getParameter("password");
                String reqIP = request.getRemoteAddr();
                session.setAttribute("ip", reqIP);
                if (pass.equals("aaa")) {
                    response.sendRedirect("main.jsp");
                } else {
                    response.sendRedirect("index.jsp?msg=IncorrectPassword");
                }
            }
            if (module.equalsIgnoreCase("make") & action.equalsIgnoreCase("add")) {
                Make make = new Make();
                make.setName(request.getParameter("make"));
                make.setRemarks(request.getParameter("remarks"));
                ut.begin();
                em.persist(make);
                ut.commit();
                String outmsg = request.getParameter("make") + " added to the database!";
                response.sendRedirect("message.jsp?msg=" + outmsg);
            }

            if (module.equalsIgnoreCase("model") & action.equalsIgnoreCase("add")) {
                ut.begin();
                
                Make make = new Make();
                make.setId(Long.parseLong(request.getParameter("make")));
                make.setName("Nissan");
                
                VehicleModel model = new VehicleModel();
                model.setDescription(request.getParameter("description"));
                
                model.setMake(make);

                em.persist(model);
                ut.commit();
                String outmsg = request.getParameter("description") + " added to the database!";
                response.sendRedirect("message.jsp?msg=" + outmsg);
            }

        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
