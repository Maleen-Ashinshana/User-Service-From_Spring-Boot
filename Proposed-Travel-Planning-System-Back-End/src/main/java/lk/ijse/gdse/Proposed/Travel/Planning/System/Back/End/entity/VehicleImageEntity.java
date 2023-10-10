package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "vehicleImage")
public class VehicleImageEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicle_image_id;
    @Column(nullable = false)
    private String vehicle_image_name;

    @ManyToOne
    @JoinColumn(name = "vehicle_id",referencedColumnName = "vehicle_id")
    private VehicleEntity vehicle;

    public VehicleImageEntity(int vehicle_image_id, String vehicle_image_name) {
        this.vehicle_image_id = vehicle_image_id;
        this.vehicle_image_name = vehicle_image_name;
    }
}
