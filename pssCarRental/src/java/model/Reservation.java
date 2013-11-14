/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ronal
 */
@Entity
public class Reservation implements Serializable {
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    private int noOfDays;
    private String calcMethod;
    private Double tax;
    private Double base;
    private Double optionTotal;
    private Double net;
    @OneToMany(mappedBy = "reservation")
    private List<ReservationOption> reservationOptions;

    public Reservation() {
    }

    public Reservation(Long id, Date startDate, int noOfDays, String calcMethod, Double tax, Double base, Double optionTotal, Double net, List<ReservationOption> reservationOptions) {
        this.id = id;
        this.startDate = startDate;
        this.noOfDays = noOfDays;
        this.calcMethod = calcMethod;
        this.tax = tax;
        this.base = base;
        this.optionTotal = optionTotal;
        this.net = net;
        this.reservationOptions = reservationOptions;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Reservation[ id=" + id + " ]";
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the noOfDays
     */
    public int getNoOfDays() {
        return noOfDays;
    }

    /**
     * @param noOfDays the noOfDays to set
     */
    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    /**
     * @return the calcMethod
     */
    public String getCalcMethod() {
        return calcMethod;
    }

    /**
     * @param calcMethod the calcMethod to set
     */
    public void setCalcMethod(String calcMethod) {
        this.calcMethod = calcMethod;
    }

    /**
     * @return the tax
     */
    public Double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * @return the base
     */
    public Double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Double base) {
        this.base = base;
    }

    /**
     * @return the optionTotal
     */
    public Double getOptionTotal() {
        return optionTotal;
    }

    /**
     * @param optionTotal the optionTotal to set
     */
    public void setOptionTotal(Double optionTotal) {
        this.optionTotal = optionTotal;
    }

    /**
     * @return the net
     */
    public Double getNet() {
        return net;
    }

    /**
     * @param net the net to set
     */
    public void setNet(Double net) {
        this.net = net;
    }

    /**
     * @return the reservationOptions
     */
    public List<ReservationOption> getReservationOptions() {
        return reservationOptions;
    }

    /**
     * @param reservationOptions the reservationOptions to set
     */
    public void setReservationOptions(List<ReservationOption> reservationOptions) {
        this.reservationOptions = reservationOptions;
    }
    
}
