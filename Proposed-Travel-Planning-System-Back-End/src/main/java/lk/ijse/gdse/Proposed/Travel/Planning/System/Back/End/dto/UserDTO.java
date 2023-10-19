package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.validation.constraints.*;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.BillEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
@NoArgsConstructor

@Data
@ToString
public class UserDTO {
    @Null(message = "User ID will auto generate")
    private String user_id;
    @NotNull(message = "user name cannot be empty")
    @Pattern(regexp = "[A-Za-z ]$")
    private String user_name;
    @NotNull(message = "user Address cannot be empty")
    private String address;

    @NotNull(message = "user register cannot be empty")
    private LocalDate user_registration_date=LocalDate.now();
    String date=user_registration_date.toString();
    @Email(message = "user email cannot be empty")
    private String email;
    @NotNull(message = "user Gender cannot be empty")
    private String gender;
    @NotNull(message = "Admin Password cannot be empty")@Size(min = 5,max = 8)
    private String password;
    @NotNull(message = "user NIC cannot be empty")
    private String nic_or_passport_number;
    @NotNull(message = "user profile picture cannot be empty")
    private String profile_picture;


    public UserDTO(String user_id, String user_name, String address, String gender, LocalDate user_registration_date, String email, String password, String nic_or_passport_number, String profile_picture) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.gender = gender;
        this.user_registration_date = user_registration_date;
        this.email = email;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
    }
}
