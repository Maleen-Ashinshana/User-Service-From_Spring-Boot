package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.*;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.HotelEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.MainTravelServiceEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PackageDTO {
    private String package_id;
    private String package_cetagory;
    private String package_hotel_cetagory;
    private String package_vehicle_cetagory;
    private String video;

    private List<MainTravelServiceEntity> mainTravelServiceEntities;

    public PackageDTO(String package_id, String package_cetagory, String package_hotel_cetagory, String package_vehicle_cetagory, String video) {
        this.package_id = package_id;
        this.package_cetagory = package_cetagory;
        this.package_hotel_cetagory = package_hotel_cetagory;
        this.package_vehicle_cetagory = package_vehicle_cetagory;
        this.video = video;
    }
}
