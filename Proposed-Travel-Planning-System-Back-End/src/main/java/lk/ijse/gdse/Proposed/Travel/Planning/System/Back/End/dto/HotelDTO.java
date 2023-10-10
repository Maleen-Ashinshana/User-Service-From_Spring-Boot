package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class HotelDTO {
    private String hotel_id;
    private  String hotel_name;

    private  String hotel_category;

    private  String location;

    private  String email;

    private  int contact_number;


    private List<MainTravelServiceEntity> mainTravelServiceEntities;

    public HotelDTO(String hotel_id, String hotel_name, String hotel_category, String location, String email, int contact_number) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_category = hotel_category;
        this.location = location;
        this.email = email;
        this.contact_number = contact_number;
    }
}
