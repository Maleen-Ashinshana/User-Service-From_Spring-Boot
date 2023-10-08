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
@Table(name = "Package")
public class PackageEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String package_id;
    private String package_cetagory;
    private String video;
    @ManyToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "hotel_id")
    private HotelEntity hotelEntity;

    @ManyToOne
    @JoinColumn(name = "vehicle_id",referencedColumnName = "vehicle_id")
    private VehicleEntity vehicleEntity;
    public PackageEntity(String package_id, String package_cetagory, String video) {
        this.package_id = package_id;
        this.package_cetagory = package_cetagory;
        this.video = video;
    }
}
