package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminEntity implements SuperEntity{
    @Id
@GeneratedValue(strategy = GenerationType.UUID)
    private String admin_id;
    @Column(nullable = false)
    private String admin_name;
    @Column(nullable = false)
    private String password;


}
