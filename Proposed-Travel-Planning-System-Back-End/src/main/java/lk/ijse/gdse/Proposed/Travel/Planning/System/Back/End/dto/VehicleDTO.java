package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.HotelEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.PackageEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class VehicleDTO {
    private String vehicle_id;
    private String vehicle_brand;
    private String vehicle_category;
    private String vehicle_image;
    private String fuel_type;
    private String fuel_usage;
    private int seat_capacity;
    private String transmission;

    private HotelEntity hotelEntity;
    private List<UserEntity> userEntities;
    private List<PackageEntity> packageEntities;

    public VehicleDTO() {
    }

    public VehicleDTO(String vehicle_id, String vehicle_brand, String vehicle_category, String vehicle_image, String fuel_type, String fuel_usage, int seat_capacity, String transmission, HotelEntity hotelEntity) {
        this.vehicle_id = vehicle_id;
        this.vehicle_brand = vehicle_brand;
        this.vehicle_category = vehicle_category;
        this.vehicle_image = vehicle_image;
        this.fuel_type = fuel_type;
        this.fuel_usage = fuel_usage;
        this.seat_capacity = seat_capacity;
        this.transmission = transmission;
        this.hotelEntity = hotelEntity;
    }

    public VehicleDTO(String vehicle_id, String vehicle_brand, String vehicle_category, String vehicle_image, String fuel_type, String fuel_usage, int seat_capacity, String transmission, HotelEntity hotelEntity, List<UserEntity> userEntities, List<PackageEntity> packageEntities) {
        this.vehicle_id = vehicle_id;
        this.vehicle_brand = vehicle_brand;
        this.vehicle_category = vehicle_category;
        this.vehicle_image = vehicle_image;
        this.fuel_type = fuel_type;
        this.fuel_usage = fuel_usage;
        this.seat_capacity = seat_capacity;
        this.transmission = transmission;
        this.hotelEntity = hotelEntity;
        this.userEntities = userEntities;
        this.packageEntities = packageEntities;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_brand() {
        return vehicle_brand;
    }

    public void setVehicle_brand(String vehicle_brand) {
        this.vehicle_brand = vehicle_brand;
    }

    public String getVehicle_category() {
        return vehicle_category;
    }

    public void setVehicle_category(String vehicle_category) {
        this.vehicle_category = vehicle_category;
    }

    public String getVehicle_image() {
        return vehicle_image;
    }

    public void setVehicle_image(String vehicle_image) {
        this.vehicle_image = vehicle_image;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getFuel_usage() {
        return fuel_usage;
    }

    public void setFuel_usage(String fuel_usage) {
        this.fuel_usage = fuel_usage;
    }

    public int getSeat_capacity() {
        return seat_capacity;
    }

    public void setSeat_capacity(int seat_capacity) {
        this.seat_capacity = seat_capacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }

    public List<PackageEntity> getPackageEntities() {
        return packageEntities;
    }

    public void setPackageEntities(List<PackageEntity> packageEntities) {
        this.packageEntities = packageEntities;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicle_id='" + vehicle_id + '\'' +
                ", vehicle_brand='" + vehicle_brand + '\'' +
                ", vehicle_category='" + vehicle_category + '\'' +
                ", vehicle_image='" + vehicle_image + '\'' +
                ", fuel_type='" + fuel_type + '\'' +
                ", fuel_usage='" + fuel_usage + '\'' +
                ", seat_capacity=" + seat_capacity +
                ", transmission='" + transmission + '\'' +
                ", hotelEntity=" + hotelEntity +
                ", userEntities=" + userEntities +
                ", packageEntities=" + packageEntities +
                '}';
    }
}
