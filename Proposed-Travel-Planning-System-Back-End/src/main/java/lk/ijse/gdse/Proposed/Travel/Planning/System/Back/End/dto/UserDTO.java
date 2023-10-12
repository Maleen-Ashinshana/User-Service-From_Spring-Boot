package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.BillEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String user_id;
    private String user_name;
    private String address;
    private String user_registration_time;
    private String email;
    private int age;
    private String password;
    private String nic_or_passport_number;
    private String profile_picture;

    private List<BillEntity> billEntities;

    public UserDTO(String user_id, String user_name, String address, String user_registration_time, String email, int age, String password, String nic_or_passport_number, String profile_picture) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.user_registration_time = user_registration_time;
        this.email = email;
        this.age = age;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
    }
}
