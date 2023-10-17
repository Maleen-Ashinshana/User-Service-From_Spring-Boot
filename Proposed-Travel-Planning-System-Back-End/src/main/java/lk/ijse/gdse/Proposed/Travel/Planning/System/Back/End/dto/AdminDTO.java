package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jdk.dynalink.linker.LinkerServices;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AdminDTO {
    @Null(message = "Admin Id will auto generate")
    private String admin_id;
    @Pattern(regexp = "[A-Za-z ]+",message = "Admin name cannot be empty")
    private String admin_name;
    @NotNull(message = "Admin Password cannot be empty")@Size(min = 5,max = 8)

    private String password;

    private List<AdminType> adminTypes=new ArrayList<>();

    public AdminDTO(String admin_id, String admin_name, String password) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.password = password;
    }

    public AdminDTO(String admin_name, String password) {
        this.admin_name = admin_name;
        this.password = password;
    }
}
