package lk.ijse.gdse.dto;

import lk.ijse.gdse.entity.HotelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelImageDTO {
    private int image_id;
    private String image;
    private HotelEntity hotelEntity;

    public HotelImageDTO(int image_id, String image) {
        this.image_id = image_id;
        this.image = image;
    }
}
