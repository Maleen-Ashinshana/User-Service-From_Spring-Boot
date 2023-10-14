package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.AdminDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.AdminEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.AdminRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AdminServiceIMPL implements AdminService {



    @Autowired
    private Convert convert;

    @Autowired
    private AdminRepository adminRepository;

    public AdminServiceIMPL(Convert convert, AdminRepository adminRepository) {
        this.convert = convert;
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminDTO saveAdmin(AdminDTO adminDTO) {
        AdminEntity adminEntity = convert.convertToEntity(adminDTO);

        // Save the AdminEntity using the repository
        AdminEntity savedAdminEntity = adminRepository.save(adminEntity);

        // Convert the saved AdminEntity back to AdminDTO for response generation
        AdminDTO savedAdminDTO = convert.convertToDTO(savedAdminEntity);

        return savedAdminDTO;

        /*System.out.println(adminDTO.getId()+  "adminServiceOMPL");
        System.out.println(adminDTO.getUserName()+  "adminServiceOMPL");
        System.out.println(adminDTO.getPassword()+  "adminServiceOMPL");


        return convert.convertToDTO(adminRepository.save(convert.convertToEntity(adminDTO)));*/
        /*return adminRepository.save(new AdminEntity(adminDTO.getId(), adminDTO.getUserName(), adminDTO));*/
        /*adminRepository.save(convert.toAdminEntity(adminDTO));*/
        /*System.out.println(convert.toadminDTO(new AdminEntity()));
        System.out.println(convert.toAdminEntity(new AdminDTO()));*/
       /* return convert.toadminDTO(adminRepository.save(convert.toAdminEntity(adminDTO)));*/
        //return adminRepository.save(new AdminEntity(adminDTO.getUserName(),adminDTO.getPassword()));
    }

    @Override
    public AdminDTO getSelectedAdmin(String id) {
        if (!adminRepository.existsById(id));
        return convert.convertToDTO(adminRepository.findById(id).get());
    }

    @Override
    public void updateAdmin(AdminDTO adminDTO) {
        Optional<AdminEntity> adminEntity=adminRepository.findById(adminDTO.getAdmin_id());
        if (!adminEntity.isPresent()){
            adminEntity.get().setAdmin_name(adminDTO.getAdmin_name());
            adminEntity.get().setPassword(adminDTO.getPassword());
        }
    }

    @Override
    public void deleteAdmin(String id) {
   if (!adminRepository.existsById(id));
   adminRepository.deleteById(id);
    }
}
