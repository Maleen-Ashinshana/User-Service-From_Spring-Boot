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
@Table(name = "Driver")
public class DriverEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String driverId;
    private String driver_name;
    private int contact_number;
    private String driver_license_image;
}
