package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.BillEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor

@Data
@ToString
public class UserDTO {
    @Null(message = "User ID will auto generate")
    private String user_id;
    @NotNull(message = "user name cannot be empty")
    @Pattern(regexp = "[A-Za-z ]+")
    private String user_name;
    @NotNull(message = "user Address cannot be empty")
    private String address;
    @NotNull(message = "user register cannot be empty")
    private String user_registration_time;
    @NotNull(message = "user email cannot be empty")
    private String email;
    @NotNull(message = "user age cannot be empty")
    private int age;
    @NotNull(message = "user password cannot be empty")
    private String password;
    @NotNull(message = "user NIC cannot be empty")
    private String nic_or_passport_number;
    @NotNull(message = "user profile picture cannot be empty")
    private String profile_picture;


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
