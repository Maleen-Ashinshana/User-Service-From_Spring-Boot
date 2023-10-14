package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.AdminEntity;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillDTO {
    private int bill_id;
    private String date;
    private AdminEntity adminEntity;


}
