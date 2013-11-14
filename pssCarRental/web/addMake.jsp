<%-- 
    Document   : addMake
    Created on : Nov 10, 2013, 2:11:33 AM
    Author     : Ronal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/bootstrap.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #005580">
        <div class="row">
            <div class="span5 offset4">
                <div class="well">
                    <legend>Add a make</legend>
                    <form method="POST" action="Control" accept-charset="UTF-8">            
                        <input class="span3" placeholder="Make" type="text" name="make">
                        <input class="span3" placeholder="Remarks" type="text" name="remarks"> 
                        <input type="hidden" name="module" value="make">
                        <input type="hidden" name="action" value="add">
                        <button class="btn-info btn" type="submit">Add</button>      
                    </form>    
                    <span id="info" class="label label-warning"></span>
                </div>
            </div>
        </div>
    </body>
</html>
