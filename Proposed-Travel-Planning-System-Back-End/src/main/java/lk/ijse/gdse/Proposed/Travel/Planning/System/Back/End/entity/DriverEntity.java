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
@Table(name = "driver")
public class DriverEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int driver_id;
    @Column(nullable = false)
    private String driver_name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private int contact_number;
    @Column(nullable = false)
    private String driver_license_image;

    @OneToOne
    @JoinColumn(name = "vehicleId",referencedColumnName = "vehicle_id")
    private VehicleEntity  vehicleEntity;

    public DriverEntity(int driver_id, String driver_name, String email, int contact_number, String driver_license_image) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.email = email;
        this.contact_number = contact_number;
        this.driver_license_image = driver_license_image;
    }
}
