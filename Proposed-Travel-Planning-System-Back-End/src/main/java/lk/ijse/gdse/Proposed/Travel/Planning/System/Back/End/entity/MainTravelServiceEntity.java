package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "user_id",cascade = CascadeType.ALL)
    private List<MainTravelServiceEntity> mainTravelServiceEntities=new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "package_id",referencedColumnName = "package_id")
    private PackageEntity packageEntity;

    public MainTravelServiceEntity(String service_id, String travel_duration, int no_of_adult, int no_of_child, String need_a_guide_or_no, int total_hed_count, int package_total) {
        this.service_id = service_id;
        this.travel_duration = travel_duration;
        this.no_of_adult = no_of_adult;
        this.no_of_child = no_of_child;
        this.need_a_guide_or_no = need_a_guide_or_no;
        this.total_hed_count = total_hed_count;
        this.package_total = package_total;
    }
}
