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
    private String admin_id;
    @NotNull(message = "Admin name cannot be empty")
    @Pattern(regexp = "[A-Za-z ]+")
    private String admin_name;
    @NotNull(message = "Admin Password cannot be empty")
    private String password;

}
