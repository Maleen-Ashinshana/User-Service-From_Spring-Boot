package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class vehicleImageDTO {
    private String vehicle_image_id;
    private String vehicle_image_name;

    private VehicleEntity vehicleEntity;

    public vehicleImageDTO(String vehicle_image_id, String vehicle_image_name) {
        this.vehicle_image_id = vehicle_image_id;
        this.vehicle_image_name = vehicle_image_name;
    }
}
