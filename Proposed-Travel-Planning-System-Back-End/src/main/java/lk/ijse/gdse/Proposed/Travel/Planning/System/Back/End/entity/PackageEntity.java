package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "package")
public class PackageEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int package_id;
    @Column(nullable = false)
    private String package_cetagory;
    @Column(nullable = false)
    private String package_hotel_cetagory;
    @Column(nullable = false)
    private String package_vehicle_cetagory;
    @Column(nullable = false)
    private String video;

    @OneToMany(mappedBy = "travelPackage")
    private List<MainTravelServiceEntity> mainTravelServiceEntity;


    public PackageEntity(int package_id, String package_cetagory, String package_hotel_cetagory, String package_vehicle_cetagory, String video) {
        this.package_id = package_id;
        this.package_cetagory = package_cetagory;
        this.package_hotel_cetagory = package_hotel_cetagory;
        this.package_vehicle_cetagory = package_vehicle_cetagory;
        this.video = video;
    }
}
