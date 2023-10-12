package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bill")
@ToString
public class BillEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bill_id;
    @Column(nullable = false)
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
    /*@ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private UserEntity userEntity;*/

    public BillEntity(int bill_id, LocalDate date) {
        this.bill_id = bill_id;
        this.date = date;
    }
}
