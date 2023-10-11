package lk.ijse.gdse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "hotelImage")
public class HotelImageEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_id;
    @Column(nullable = false )
    @Lob
    private String image;
    @ManyToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "hotel_id")
    private HotelEntity hotelEntity;

    public HotelImageEntity(int image_id, String image) {
        this.image_id = image_id;
        this.image = image;
    }
}
