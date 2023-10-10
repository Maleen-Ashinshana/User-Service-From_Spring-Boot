package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.*;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MainTravelServiceDTO {
    private String service_id;
    private String travel_area;
    private String start_date;
    private String end_date;
    private int no_of_adult;
    private int no_of_child;
    private String need_a_guide_or_no;
    private int total_hed_count;
    private String user_package_start_time;
    private String with_package_or_no;
    private String with_guide_or_no;
    private int package_total;

    private UserEntity userEntity;
    private GuideEntity guideEntity;
    private HotelEntity hotelEntity;
    private VehicleEntity vehicle_id;
    private PackageEntity package_id;

    public MainTravelServiceDTO(String service_id, String travel_area, String start_date, String end_date, int no_of_adult, int no_of_child, String need_a_guide_or_no, int total_hed_count, String user_package_start_time, String with_package_or_no, String with_guide_or_no, int package_total) {
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
