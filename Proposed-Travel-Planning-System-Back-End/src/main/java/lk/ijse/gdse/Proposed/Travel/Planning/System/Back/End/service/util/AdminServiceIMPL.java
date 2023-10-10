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
    @Override
    public AdminDTO saveAdmin(AdminDTO adminDTO) {
        return convert.toadminDTO(adminRepository.save(convert.toAdminEntity(adminDTO)));
        /*adminRepository.save(convert.toAdminEntity(adminDTO));*/
        /*System.out.println(convert.toadminDTO(new AdminEntity()));
        System.out.println(convert.toAdminEntity(new AdminDTO()));*/
       /* return convert.toadminDTO(adminRepository.save(convert.toAdminEntity(adminDTO)));*/
        //return adminRepository.save(new AdminEntity(adminDTO.getUserName(),adminDTO.getPassword()));
    }

    @Override
    public AdminDTO getSelectedAdmin(String id) {
        if (!adminRepository.existsById(id));
        return convert.toadminDTO(adminRepository.getById(id));
    }

    @Override
    public void updateAdmin(AdminDTO adminDTO) {
        Optional<AdminEntity> adminEntity=adminRepository.findById(adminDTO.getId());
        if (!adminEntity.isPresent()){
            adminEntity.get().setUserName(adminDTO.getUserName());
            adminEntity.get().setPassword(adminDTO.getPassword());
        }
    }

    @Override
    public void deleteAdmin(String id) {
   if (!adminRepository.existsById(id));
   adminRepository.deleteById(id);
    }
}
