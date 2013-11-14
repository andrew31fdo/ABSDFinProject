/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Ronal
 */
@Entity
public class Rate implements Serializable {
    @ManyToMany(mappedBy = "rates")
    private List<VehicleClass> vehicleClasss;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double perDayCost;

    public Rate(List<VehicleClass> vehicleClasss, Long id, Double perDayCost) {
        this.vehicleClasss = vehicleClasss;
        this.id = id;
        this.perDayCost = perDayCost;
    }

    public Rate() {
    }

    public void setVehicleClasss(List<VehicleClass> vehicleClasss) {
        this.vehicleClasss = vehicleClasss;
    }

    public void setPerDayCost(Double perDayCost) {
        this.perDayCost = perDayCost;
    }

    public List<VehicleClass> getVehicleClasss() {
        return vehicleClasss;
    }

    public Double getPerDayCost() {
        return perDayCost;
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
        if (!(object instanceof Rate)) {
            return false;
        }
        Rate other = (Rate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rate[ id=" + id + " ]";
    }
    
}
