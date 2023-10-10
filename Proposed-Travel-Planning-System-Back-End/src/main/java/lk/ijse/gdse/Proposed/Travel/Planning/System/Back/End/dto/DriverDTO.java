package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.*;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDTO {

    private String driver_id;

    private String driver_name;

    private String email;

    private int contact_number;

    private String driver_license_image;

    private VehicleEntity  vehicleEntity;

    public DriverDTO(String driver_id, String driver_name, String email, int contact_number, String driver_license_image) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.email = email;
        this.contact_number = contact_number;
        this.driver_license_image = driver_license_image;
    }
}
