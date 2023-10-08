package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

public class AdminDTO {
    private String id;
    private String UserName;
    private String password;

    public AdminDTO() {
    }

    public AdminDTO(String id, String userName, String password) {
        this.id = id;
        UserName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "AdminDTO{" +
                "id='" + id + '\'' +
                ", UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
