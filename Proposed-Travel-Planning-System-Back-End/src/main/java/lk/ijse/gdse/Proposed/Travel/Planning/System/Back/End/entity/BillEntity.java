package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillEntity implements SuperEntity {
@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bill_id;
    @Column(nullable = false)
    private String date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
