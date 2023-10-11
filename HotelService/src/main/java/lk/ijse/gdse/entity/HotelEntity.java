package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "hotel")
public class HotelEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotel_id;
    @Column(nullable = false)
    private  String hotel_name;
    @Column(nullable = false)
    private  String hotel_category;
    @Column(nullable = false)
    private  String location;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  int contact_number;

    @OneToMany(mappedBy = "hotelImage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HotelImageEntity> images;

    /*@OneToMany(mappedBy = "hotel")
    private List<MainTravelServiceEntity> mainTravelServiceEntities;*/


    public HotelEntity(int hotel_id, String hotel_name, String hotel_category, String location, String email, int contact_number) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_category = hotel_category;
        this.location = location;
        this.email = email;
        this.contact_number = contact_number;
    }
}
