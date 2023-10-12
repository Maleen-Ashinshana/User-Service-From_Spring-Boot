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
@ToString
@Builder
public class BillDTO {
    private int bill_id;
    @Column(nullable = false)
    private LocalDate date;
    private AdminEntity adminEntity;

    public BillDTO(int bill_id, LocalDate date) {
        this.bill_id = bill_id;
        this.date = date;
    }
}
