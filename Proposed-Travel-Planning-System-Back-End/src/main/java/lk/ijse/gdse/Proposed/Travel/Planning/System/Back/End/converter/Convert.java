package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter;


import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.*;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Convert {
    private  final ModelMapper modelMapper;

    public Convert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public AdminDTO convertToDTO(AdminEntity admin) {
        System.out.println(admin.getUser_id()+"Entity");
        System.out.println(admin.getUserName()+"Entity");
        System.out.println(admin.getPassword()+"Entity");
        return modelMapper.map(admin, AdminDTO.class);
    }

    public AdminEntity convertToEntity(AdminDTO adminDTO) {
        System.out.println(adminDTO.getUser_id()+"DTO");
        System.out.println(adminDTO.getUserName()+"DTO");
        System.out.println(adminDTO.getPassword()+"DTO");
        return modelMapper.map(adminDTO, AdminEntity.class);
    }
    /*public AdminDTO toadminDTO(AdminEntity adminEntity){
        System.out.println(adminEntity.getId()+"*****");
        System.out.println(adminEntity.getUserName()+"*****");
        System.out.println(adminEntity.getPassword()+"*****");
        return modelMapper.map(adminEntity,AdminDTO.class);
    }
    public AdminEntity toAdminEntity(AdminDTO adminDTO){
        System.out.println(adminDTO.getId());
        System.out.println(adminDTO.getUserName());
        System.out.println(adminDTO.getPassword());
        return modelMapper.map(adminDTO, AdminEntity.class);

    }*/




    public DriverEntity toDriverEntity(DriverDTO driverDTO){
        return modelMapper.map(driverDTO, DriverEntity.class);
    }
    public  DriverDTO toDriverDTO(DriverDTO driverDTO){
        return modelMapper.map(driverDTO, DriverDTO.class);
    }

    public GuideEntity toGuiderEntity(GuiderDTO guiderDTO){
        return modelMapper.map(guiderDTO, GuideEntity.class);
    }
    public  GuiderDTO toGuiderDTO(GuideEntity guideEntity){
        return modelMapper.map(guideEntity, GuiderDTO.class);
    }

    public HotelEntity toHotelEntity(HotelDTO hotelDTO){
        return modelMapper.map(hotelDTO, HotelEntity.class);
    }
    public  HotelDTO toHotelDTO(HotelEntity hotelEntity){
        return modelMapper.map(hotelEntity, HotelDTO.class);
    }

    public MainTravelServiceEntity toMainTravelServiceEntity(MainTravelServiceDTO travelServiceDTO){
        return modelMapper.map(travelServiceDTO, MainTravelServiceEntity.class);
    }
    public   MainTravelServiceDTO toTravelServiceDTO(MainTravelServiceEntity travelServiceEntity){
        return modelMapper.map(travelServiceEntity, MainTravelServiceDTO.class);
    }

    public PackageEntity toPackageEntity(PackageDTO packageDTO){
        return modelMapper.map(packageDTO, PackageEntity.class);
    }
    public  PackageDTO toPackageDTO(PackageEntity packageEntity){
        return modelMapper.map(packageEntity, PackageDTO.class);
    }

    public UserEntity toUserEntity(UserDTO userDTO){
        return modelMapper.map(userDTO, UserEntity.class);
    }
    public  UserDTO toUserDTO(UserEntity userEntity){
        return modelMapper.map(userEntity, UserDTO.class);
    }

    /*public VehicleEntity toVehicleEntity(VehicleDTO vehicleDTO){
        return modelMapper.map(vehicleDTO, VehicleEntity.class);
    }
    public  VehicleDTO toVehicleDTO(VehicleEntity  vehicleEntity){
        return modelMapper.map(vehicleEntity, VehicleDTO.class);
    }
    public VehicleImageEntity toVehicleImageEntity(vehicleImageDTO vehicleImageDTO){
        return modelMapper.map(vehicleImageDTO, VehicleImageEntity.class);
    }
    public  vehicleImageDTO toVehicleImageDTO(VehicleImageEntity  vehicleImageEntity){
        return modelMapper.map(vehicleImageEntity, vehicleImageDTO.class);
    }*/
}
