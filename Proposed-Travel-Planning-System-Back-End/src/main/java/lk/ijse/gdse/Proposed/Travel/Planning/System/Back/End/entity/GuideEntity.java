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
@Table(name = "Guide")
public class GuideEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String guide_id;
    private String guide_name;
    private String address;
    private int age;
    private int contact_number;
    private String gender;
    private String profile_picture;

    @ManyToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "hotel_id")
    private HotelEntity hotelEntity;

    public GuideEntity(String guide_id, String guide_name, String address, int age, int contact_number, String gender, String profile_picture) {
        this.guide_id = guide_id;
        this.guide_name = guide_name;
        this.address = address;
        this.age = age;
        this.contact_number = contact_number;
        this.gender = gender;
        this.profile_picture = profile_picture;
    }
}
