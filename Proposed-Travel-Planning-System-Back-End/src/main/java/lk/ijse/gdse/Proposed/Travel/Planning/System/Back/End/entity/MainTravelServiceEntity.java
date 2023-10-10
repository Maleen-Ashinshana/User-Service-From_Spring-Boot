package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.SQLData;
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
    @Column(nullable = false)
    private String travel_area;
    @Column(nullable = false)
    private String start_date;
    @Column(nullable = false)
    private String end_date;
    @Column(nullable = false)
    private int no_of_adult;
    @Column(nullable = false)
    private int no_of_child;
    @Column(nullable = false)
    private String need_a_guide_or_no;
    @Column(nullable = false)
    private int total_hed_count;
    @Column(nullable = false)
    private String user_package_start_time;
    @Column(nullable = false)
    private String with_package_or_no;
    @Column(nullable = false)
    private String with_guide_or_no;
    @Column(nullable = false)
    private int package_total;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "guide_id", referencedColumnName = "guide_id")
    private GuideEntity guideEntity;

    @ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id")
    private HotelEntity hotelEntity;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "vehicle_id")
    private VehicleEntity vehicle_id;

    @ManyToOne
    @JoinColumn(name = "package_id", referencedColumnName = "package_id")
    private PackageEntity package_id;

    public MainTravelServiceEntity(String service_id, String travel_area, String start_date, String end_date, int no_of_adult, int no_of_child, String need_a_guide_or_no, int total_hed_count, String user_package_start_time, String with_package_or_no, String with_guide_or_no, int package_total) {
        this.service_id = service_id;
        this.travel_area = travel_area;
        this.start_date = start_date;
        this.end_date = end_date;
        this.no_of_adult = no_of_adult;
        this.no_of_child = no_of_child;
        this.need_a_guide_or_no = need_a_guide_or_no;
        this.total_hed_count = total_hed_count;
        this.user_package_start_time = user_package_start_time;
        this.with_package_or_no = with_package_or_no;
        this.with_guide_or_no = with_guide_or_no;
        this.package_total = package_total;
    }
}
