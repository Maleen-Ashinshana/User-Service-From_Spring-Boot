package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

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
    @Column(nullable = false)
    private String vehicle_brand;
    @Column(nullable = false)
    private String vehicle_category;
    @Column(nullable = false)
    private String vehicle_image;
    @Column(nullable = false)
    private String fuel_type;
    @Column(nullable = false)
    private String fuel_usage;
    @Column(nullable = false)
    private int seat_capacity;
    @Column(nullable = false)
    private String transmission;
    @OneToMany(mappedBy = "service_id",cascade =CascadeType.ALL)
    private List<MainTravelServiceEntity> mainTravelServiceEntities=new ArrayList<>();

    @OneToMany(mappedBy = "vehicle_image_id",cascade =CascadeType.ALL)
    private List<VehicleImageEntity> vehicle_image_id=new ArrayList<>();
    @OneToOne
    private DriverEntity driverEntity;

    public VehicleEntity(String vehicle_id, String vehicle_brand, String vehicle_category, String vehicle_image, String fuel_type, String fuel_usage, int seat_capacity, String transmission) {
        this.vehicle_id = vehicle_id;
        this.vehicle_brand = vehicle_brand;
        this.vehicle_category = vehicle_category;
        this.vehicle_image = vehicle_image;
        this.fuel_type = fuel_type;
        this.fuel_usage = fuel_usage;
        this.seat_capacity = seat_capacity;
        this.transmission = transmission;
    }
}
