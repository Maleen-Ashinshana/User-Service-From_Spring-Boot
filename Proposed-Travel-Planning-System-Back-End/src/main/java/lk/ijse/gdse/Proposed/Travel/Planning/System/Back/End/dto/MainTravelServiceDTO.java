package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.MainTravelServiceEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.PackageEntity;

import java.util.ArrayList;
import java.util.List;

public class MainTravelServiceDTO {
    private String service_id;
    private String travel_duration;
    private int no_of_adult;
    private int no_of_child;
    private String need_a_guide_or_no;
    private int total_hed_count;
    private int package_total;

    private List<MainTravelServiceEntity> mainTravelServiceEntities;

    private PackageEntity packageEntity;

    public MainTravelServiceDTO() {
    }

    public MainTravelServiceDTO(String service_id, String travel_duration, int no_of_adult, int no_of_child, String need_a_guide_or_no, int total_hed_count, int package_total) {
        this.service_id = service_id;
        this.travel_duration = travel_duration;
        this.no_of_adult = no_of_adult;
        this.no_of_child = no_of_child;
        this.need_a_guide_or_no = need_a_guide_or_no;
        this.total_hed_count = total_hed_count;
        this.package_total = package_total;
    }

    public MainTravelServiceDTO(String service_id, String travel_duration, int no_of_adult, int no_of_child, String need_a_guide_or_no, int total_hed_count, int package_total, List<MainTravelServiceEntity> mainTravelServiceEntities, PackageEntity packageEntity) {
        this.service_id = service_id;
        this.travel_duration = travel_duration;
        this.no_of_adult = no_of_adult;
        this.no_of_child = no_of_child;
        this.need_a_guide_or_no = need_a_guide_or_no;
        this.total_hed_count = total_hed_count;
        this.package_total = package_total;
        this.mainTravelServiceEntities = mainTravelServiceEntities;
        this.packageEntity = packageEntity;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getTravel_duration() {
        return travel_duration;
    }

    public void setTravel_duration(String travel_duration) {
        this.travel_duration = travel_duration;
    }

    public int getNo_of_adult() {
        return no_of_adult;
    }

    public void setNo_of_adult(int no_of_adult) {
        this.no_of_adult = no_of_adult;
    }

    public int getNo_of_child() {
        return no_of_child;
    }

    public void setNo_of_child(int no_of_child) {
        this.no_of_child = no_of_child;
    }

    public String getNeed_a_guide_or_no() {
        return need_a_guide_or_no;
    }

    public void setNeed_a_guide_or_no(String need_a_guide_or_no) {
        this.need_a_guide_or_no = need_a_guide_or_no;
    }

    public int getTotal_hed_count() {
        return total_hed_count;
    }

    public void setTotal_hed_count(int total_hed_count) {
        this.total_hed_count = total_hed_count;
    }

    public int getPackage_total() {
        return package_total;
    }

    public void setPackage_total(int package_total) {
        this.package_total = package_total;
    }

    public List<MainTravelServiceEntity> getMainTravelServiceEntities() {
        return mainTravelServiceEntities;
    }

    public void setMainTravelServiceEntities(List<MainTravelServiceEntity> mainTravelServiceEntities) {
        this.mainTravelServiceEntities = mainTravelServiceEntities;
    }

    public PackageEntity getPackageEntity() {
        return packageEntity;
    }

    public void setPackageEntity(PackageEntity packageEntity) {
        this.packageEntity = packageEntity;
    }

    @Override
    public String toString() {
        return "MainTravelServiceDTO{" +
                "service_id='" + service_id + '\'' +
                ", travel_duration='" + travel_duration + '\'' +
                ", no_of_adult=" + no_of_adult +
                ", no_of_child=" + no_of_child +
                ", need_a_guide_or_no='" + need_a_guide_or_no + '\'' +
                ", total_hed_count=" + total_hed_count +
                ", package_total=" + package_total +
                ", mainTravelServiceEntities=" + mainTravelServiceEntities +
                ", packageEntity=" + packageEntity +
                '}';
    }
}
