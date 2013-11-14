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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ronal
 */
@Entity
public class Vehicle implements Serializable {

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @ManyToOne
    private VehicleClass vehicleClass;
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numberPlate;
    private String chaseNumber;
    private String Color;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date firstRegistration;
    private Integer dailyMilage;
    private String imagePath;
    private String Status;
    @ManyToOne
    private VehicleModel vehicleModel;
    @ManyToOne
    private Location location;
    @ManyToMany
    private List<Feature> features;

    public Vehicle() {
    }

    public Vehicle(VehicleClass vehicleClass, Long id, String numberPlate, String chaseNumber, String Color, Date firstRegistration, Integer dailyMilage, String imagePath, String Status, VehicleModel vehicleModel, Location location, List<Feature> features) {
        this.vehicleClass = vehicleClass;
        this.id = id;
        this.numberPlate = numberPlate;
        this.chaseNumber = chaseNumber;
        this.Color = Color;
        this.firstRegistration = firstRegistration;
        this.dailyMilage = dailyMilage;
        this.imagePath = imagePath;
        this.Status = Status;
        this.vehicleModel = vehicleModel;
        this.location = location;
        this.features = features;
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
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Vehicle[ id=" + id + " ]";
    }

    /**
     * @return the vehicleClass
     */
    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    /**
     * @param vehicleClass the vehicleClass to set
     */
    public void setVehicleClass(VehicleClass vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    /**
     * @return the numberPlate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * @param numberPlate the numberPlate to set
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * @return the chaseNumber
     */
    public String getChaseNumber() {
        return chaseNumber;
    }

    /**
     * @param chaseNumber the chaseNumber to set
     */
    public void setChaseNumber(String chaseNumber) {
        this.chaseNumber = chaseNumber;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the firstRegistration
     */
    public Date getFirstRegistration() {
        return firstRegistration;
    }

    /**
     * @param firstRegistration the firstRegistration to set
     */
    public void setFirstRegistration(Date firstRegistration) {
        this.firstRegistration = firstRegistration;
    }

    /**
     * @return the dailyMilage
     */
    public Integer getDailyMilage() {
        return dailyMilage;
    }

    /**
     * @param dailyMilage the dailyMilage to set
     */
    public void setDailyMilage(Integer dailyMilage) {
        this.dailyMilage = dailyMilage;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the vehicleModel
     */
    public VehicleModel getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel the vehicleModel to set
     */
    public void setVehicleModel(VehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the features
     */
    public List<Feature> getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    
}
