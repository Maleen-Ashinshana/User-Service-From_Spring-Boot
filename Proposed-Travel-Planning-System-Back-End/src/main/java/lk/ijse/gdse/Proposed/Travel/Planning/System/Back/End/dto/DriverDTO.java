package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;

public class DriverDTO {
    private String driver_id;
    private String driver_name;
    private int contact_number;
    private String driver_license_image;

    private VehicleEntity vehicleEntity;

    public DriverDTO() {
    }

    public DriverDTO(String driver_id, String driver_name, int contact_number, String driver_license_image) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.contact_number = contact_number;
        this.driver_license_image = driver_license_image;
    }

    public DriverDTO(String driver_id, String driver_name, int contact_number, String driver_license_image, VehicleEntity vehicleEntity) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.contact_number = contact_number;
        this.driver_license_image = driver_license_image;
        this.vehicleEntity = vehicleEntity;
    }

    public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getDriver_license_image() {
        return driver_license_image;
    }

    public void setDriver_license_image(String driver_license_image) {
        this.driver_license_image = driver_license_image;
    }

    public VehicleEntity getVehicleEntity() {
        return vehicleEntity;
    }

    public void setVehicleEntity(VehicleEntity vehicleEntity) {
        this.vehicleEntity = vehicleEntity;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "driver_id='" + driver_id + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", contact_number=" + contact_number +
                ", driver_license_image='" + driver_license_image + '\'' +
                ", vehicleEntity=" + vehicleEntity +
                '}';
    }
}
