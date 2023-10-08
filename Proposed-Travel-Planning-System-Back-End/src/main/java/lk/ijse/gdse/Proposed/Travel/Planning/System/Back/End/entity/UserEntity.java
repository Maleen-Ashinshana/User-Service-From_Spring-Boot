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
@Table(name = "User")
public class UserEntity implements SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;
    private String user_name;
    private String address;
    private String email;
    private int age;
    private String password;
    private String nic_or_passport_number;
    private String profile_picture;
    @ManyToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "hotel_id")
    private HotelEntity hotelEntity;
    @ManyToOne
    @JoinColumn(name = "vehicle_id",referencedColumnName = "vehicle_id")
    private VehicleEntity vehicleEntity;
    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "service_id")
    private MainTravelServiceEntity mainTravelServiceEntity;

    public UserEntity(String user_id, String user_name, String address, String email, int age, String password, String nic_or_passport_number, String profile_picture) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
    }
}
