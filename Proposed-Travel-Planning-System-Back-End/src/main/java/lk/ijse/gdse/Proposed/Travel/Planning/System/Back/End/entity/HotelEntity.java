package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.IndexOptions;
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


}
