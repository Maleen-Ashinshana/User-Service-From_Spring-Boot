package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.GuideEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.PackageEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;

import java.util.ArrayList;
import java.util.List;

public class HotelDTO {
    private String hotel_id;
    private  String hotel_name;
    private  String hotel_category;
    private  String location;
    private  String email;
    private  int contact_number;

    private List<GuideEntity> guideEntities;

    private List<UserEntity> userEntities;


    private List<VehicleEntity> vehicleEntities;


    private List<PackageEntity> packageEntities;

    public HotelDTO() {
    }

    public HotelDTO(String hotel_id, String hotel_name, String hotel_category, String location, String email, int contact_number) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_category = hotel_category;
        this.location = location;
        this.email = email;
        this.contact_number = contact_number;
    }

    public HotelDTO(String hotel_id, String hotel_name, String hotel_category, String location, String email, int contact_number, List<GuideEntity> guideEntities, List<UserEntity> userEntities, List<VehicleEntity> vehicleEntities, List<PackageEntity> packageEntities) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_category = hotel_category;
        this.location = location;
        this.email = email;
        this.contact_number = contact_number;
        this.guideEntities = guideEntities;
        this.userEntities = userEntities;
        this.vehicleEntities = vehicleEntities;
        this.packageEntities = packageEntities;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_category() {
        return hotel_category;
    }

    public void setHotel_category(String hotel_category) {
        this.hotel_category = hotel_category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public List<GuideEntity> getGuideEntities() {
        return guideEntities;
    }

    public void setGuideEntities(List<GuideEntity> guideEntities) {
        this.guideEntities = guideEntities;
    }

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }

    public List<VehicleEntity> getVehicleEntities() {
        return vehicleEntities;
    }

    public void setVehicleEntities(List<VehicleEntity> vehicleEntities) {
        this.vehicleEntities = vehicleEntities;
    }

    public List<PackageEntity> getPackageEntities() {
        return packageEntities;
    }

    public void setPackageEntities(List<PackageEntity> packageEntities) {
        this.packageEntities = packageEntities;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "hotel_id='" + hotel_id + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_category='" + hotel_category + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", contact_number=" + contact_number +
                ", guideEntities=" + guideEntities +
                ", userEntities=" + userEntities +
                ", vehicleEntities=" + vehicleEntities +
                ", packageEntities=" + packageEntities +
                '}';
    }
}
