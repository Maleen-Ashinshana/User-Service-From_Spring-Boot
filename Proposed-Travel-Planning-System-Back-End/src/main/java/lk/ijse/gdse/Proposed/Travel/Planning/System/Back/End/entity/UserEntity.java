package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;
    @Column(nullable = false)
    private String user_name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
private String user_registration_time;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String nic_or_passport_number;
    @Lob
    @Column(nullable = false,columnDefinition = "LONGTEXT")
    private String profile_picture;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BillEntity> billEntities;


    /*@OneToMany(mappedBy = "user")
    private List<BillEntity> billEntities=new ArrayList<>();*/


    public UserEntity(String user_id, String user_name, String address, String user_registration_time, String email, int age, String password, String nic_or_passport_number, String profile_picture) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.user_registration_time = user_registration_time;
        this.email = email;
        this.age = age;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
    }

}
