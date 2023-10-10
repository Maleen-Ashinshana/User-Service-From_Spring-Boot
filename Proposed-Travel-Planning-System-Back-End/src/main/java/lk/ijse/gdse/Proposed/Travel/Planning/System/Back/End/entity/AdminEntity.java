package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Table(name = "admin")
public class AdminEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String user_id;
    @Column(nullable = false)
    private String UserName;
    @Column(nullable = false)
    private String password;

    public AdminEntity() {
    }

    public AdminEntity(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public AdminEntity(String id, String userName, String password) {
        this.user_id = id;
        UserName = userName;
        this.password = password;
    }

    public String getId() {
        return user_id;
    }

    public void setId(String id) {
        this.user_id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
