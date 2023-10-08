package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.IndexOptions;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "Hotel")
public class HotelEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String hotel_id;
    private  String hotel_name;
    private  String hotel_category;
    private  String location;
    private  String email;
    private  int contact_number;
    @OneToMany(mappedBy = "guide_id",cascade = CascadeType.ALL)

    private List<GuideEntity> guideEntities=new ArrayList<>();
    @OneToMany(mappedBy = "user_id",cascade = CascadeType.ALL)
    private List<UserEntity> userEntities=new ArrayList<>();

    @OneToMany(mappedBy = "vehicle_id",cascade = CascadeType.ALL)
    private List<VehicleEntity> vehicleEntities=new ArrayList<>();

    @OneToMany(mappedBy = "package_id",cascade = CascadeType.ALL)
    private List<PackageEntity> packageEntities=new ArrayList<>();

    public HotelEntity(String hotel_id, String hotel_name, String hotel_category, String location, String email, int contact_number) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_category = hotel_category;
        this.location = location;
        this.email = email;
        this.contact_number = contact_number;
    }
}
