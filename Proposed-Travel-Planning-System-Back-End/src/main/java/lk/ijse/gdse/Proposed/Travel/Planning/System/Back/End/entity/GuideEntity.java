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
@Table(name = "Guide")
public class GuideEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String guide_id;
    @Column(nullable = false)
    private String guide_name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private int contact_number;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String profile_picture;

    @OneToMany(mappedBy = "service_id",cascade =CascadeType.ALL)
    private List<MainTravelServiceEntity> mainTravelServiceEntities=new ArrayList<>();

    public GuideEntity(String guide_id, String guide_name, String address, int age, int contact_number, String gender, String profile_picture) {
        this.guide_id = guide_id;
        this.guide_name = guide_name;
        this.address = address;
        this.age = age;
        this.contact_number = contact_number;
        this.gender = gender;
        this.profile_picture = profile_picture;
    }
}
