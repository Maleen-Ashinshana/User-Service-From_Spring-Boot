package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "vehicle")
public class VehicleEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vehicle_id;
    private String vehicle_brand;
    private String vehicle_category;
    private String vehicle_image;
    private String fuel_type;
    private String fuel_usage;
    private int seat_capacity;
    private String transmission;

}
