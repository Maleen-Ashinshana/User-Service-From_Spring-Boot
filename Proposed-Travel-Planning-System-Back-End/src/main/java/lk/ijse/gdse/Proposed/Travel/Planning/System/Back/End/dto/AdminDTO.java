package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {
    @Null(message = "Admin Id will auto generate")
    private String user_id;
    @NotNull(message = "Admin name cannot be empty")
    @Pattern(regexp = "[A-Za-z ]+")
    private String userName;
    @NotNull(message = "Admin Password cannot be empty")
    private String password;

    public AdminDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
