package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.HotelEntity;

public class GuiderDTO {
    private String guide_id;
    private String guide_name;
    private String address;
    private int age;
    private int contact_number;
    private String gender;
    private String profile_picture;

    private HotelEntity hotelEntity;

    public GuiderDTO() {
    }

    public GuiderDTO(String guide_id, String guide_name, String address, int age, int contact_number, String gender, String profile_picture) {
        this.guide_id = guide_id;
        this.guide_name = guide_name;
        this.address = address;
        this.age = age;
        this.contact_number = contact_number;
        this.gender = gender;
        this.profile_picture = profile_picture;
    }

    public GuiderDTO(String guide_id, String guide_name, String address, int age, int contact_number, String gender, String profile_picture, HotelEntity hotelEntity) {
        this.guide_id = guide_id;
        this.guide_name = guide_name;
        this.address = address;
        this.age = age;
        this.contact_number = contact_number;
        this.gender = gender;
        this.profile_picture = profile_picture;
        this.hotelEntity = hotelEntity;
    }

    public String getGuide_id() {
        return guide_id;
    }

    public void setGuide_id(String guide_id) {
        this.guide_id = guide_id;
    }

    public String getGuide_name() {
        return guide_name;
    }

    public void setGuide_name(String guide_name) {
        this.guide_name = guide_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "GuiderDTO{" +
                "guide_id='" + guide_id + '\'' +
                ", guide_name='" + guide_name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", contact_number=" + contact_number +
                ", gender='" + gender + '\'' +
                ", profile_picture='" + profile_picture + '\'' +
                ", hotelEntity=" + hotelEntity +
                '}';
    }
}
