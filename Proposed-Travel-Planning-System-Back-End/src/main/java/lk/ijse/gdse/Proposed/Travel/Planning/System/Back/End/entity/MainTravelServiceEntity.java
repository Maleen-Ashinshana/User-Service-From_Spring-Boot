package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "MainTravelService")
public class MainTravelServiceEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String service_id;
    private String travel_duration;
    private int no_of_adult;
    private int no_of_child;
    private String need_a_guide_or_no;
    private int total_hed_count;
    private int package_total;
}
