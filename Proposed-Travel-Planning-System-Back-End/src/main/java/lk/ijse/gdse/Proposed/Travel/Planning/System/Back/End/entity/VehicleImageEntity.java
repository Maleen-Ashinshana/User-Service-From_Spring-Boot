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
@Table(name = "vehicle_images")
public class VehicleImageEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vehicle_image_id;
    @Column(nullable = false)
    private String vehicle_image_name;
    @ManyToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
    private VehicleEntity vehicle_id;

    public VehicleImageEntity(String vehicle_image_id, String vehicle_image_name) {
        this.vehicle_image_id = vehicle_image_id;
        this.vehicle_image_name = vehicle_image_name;
    }
}
