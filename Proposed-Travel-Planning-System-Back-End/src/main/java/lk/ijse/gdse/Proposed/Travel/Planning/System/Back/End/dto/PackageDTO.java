package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.HotelEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;

public class PackageDTO {
    private String package_id;
    private String package_cetagory;
    private String video;

    private HotelEntity hotelEntity;
    private VehicleEntity vehicleEntity;

    public PackageDTO() {
    }

    public PackageDTO(String package_id, String package_cetagory, String video) {
        this.package_id = package_id;
        this.package_cetagory = package_cetagory;
        this.video = video;
    }

    public PackageDTO(String package_id, String package_cetagory, String video, HotelEntity hotelEntity, VehicleEntity vehicleEntity) {
        this.package_id = package_id;
        this.package_cetagory = package_cetagory;
        this.video = video;
        this.hotelEntity = hotelEntity;
        this.vehicleEntity = vehicleEntity;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getPackage_cetagory() {
        return package_cetagory;
    }

    public void setPackage_cetagory(String package_cetagory) {
        this.package_cetagory = package_cetagory;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    public VehicleEntity getVehicleEntity() {
        return vehicleEntity;
    }

    public void setVehicleEntity(VehicleEntity vehicleEntity) {
        this.vehicleEntity = vehicleEntity;
    }

    @Override
    public String toString() {
        return "PackageDTO{" +
                "package_id='" + package_id + '\'' +
                ", package_cetagory='" + package_cetagory + '\'' +
                ", video='" + video + '\'' +
                ", hotelEntity=" + hotelEntity +
                ", vehicleEntity=" + vehicleEntity +
                '}';
    }
}
