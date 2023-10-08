package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.HotelEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.MainTravelServiceEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.VehicleEntity;

public class UserDTO {
    private String user_id;
    private String user_name;
    private String address;
    private String email;
    private int age;
    private String password;
    private String nic_or_passport_number;
    private String profile_picture;

    private HotelEntity hotelEntity;
    private VehicleEntity vehicleEntity;
    private MainTravelServiceEntity mainTravelServiceEntity;

    public UserDTO() {
    }

    public UserDTO(String user_id, String user_name, String address, String email, int age, String password, String nic_or_passport_number, String profile_picture) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
    }

    public UserDTO(String user_id, String user_name, String address, String email, int age, String password, String nic_or_passport_number, String profile_picture, HotelEntity hotelEntity, VehicleEntity vehicleEntity, MainTravelServiceEntity mainTravelServiceEntity) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.password = password;
        this.nic_or_passport_number = nic_or_passport_number;
        this.profile_picture = profile_picture;
        this.hotelEntity = hotelEntity;
        this.vehicleEntity = vehicleEntity;
        this.mainTravelServiceEntity = mainTravelServiceEntity;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic_or_passport_number() {
        return nic_or_passport_number;
    }

    public void setNic_or_passport_number(String nic_or_passport_number) {
        this.nic_or_passport_number = nic_or_passport_number;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    public VehicleEntity getVehicleEntity() {
        return vehicleEntity;
    }

    public void setVehicleEntity(VehicleEntity vehicleEntity) {
        this.vehicleEntity = vehicleEntity;
    }

    public MainTravelServiceEntity getMainTravelServiceEntity() {
        return mainTravelServiceEntity;
    }

    public void setMainTravelServiceEntity(MainTravelServiceEntity mainTravelServiceEntity) {
        this.mainTravelServiceEntity = mainTravelServiceEntity;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", nic_or_passport_number='" + nic_or_passport_number + '\'' +
                ", profile_picture='" + profile_picture + '\'' +
                ", hotelEntity=" + hotelEntity +
                ", vehicleEntity=" + vehicleEntity +
                ", mainTravelServiceEntity=" + mainTravelServiceEntity +
                '}';
    }
}
