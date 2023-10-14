package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserServiceIMPL implements UserService {
    @Autowired
    private Convert convert;
    @Autowired
   /* @Qualifier("UserRepository")*/
    private UserRepository  userRepository;



    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return convert.toUserDTO(userRepository.save(convert.toUserEntity(userDTO)));
    }

    @Override
    public UserDTO getSelectedUser(String id) {
        return convert.toUserDTO(userRepository.findById(id).get());
    }

    @Override
    public UserDTO getByName(String name) {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        Optional<UserEntity> user=userRepository.findById(userDTO.getUser_id());
        if (!user.isPresent()){
            user.get().setUser_name(userDTO.getUser_name());
            user.get().setEmail(userDTO.getEmail());
            user.get().setUser_registration_time(userDTO.getUser_registration_time());
            user.get().setEmail(userDTO.getEmail());
            user.get().setAddress(userDTO.getAddress());
            user.get().setPassword(userDTO.getPassword());
            user.get().setNic_or_passport_number(userDTO.getNic_or_passport_number());
            user.get().setProfile_picture(userDTO.getProfile_picture());
        }

    }

    @Override
    public void deleteUser(String user_id) {
    userRepository.deleteById(user_id);
    }
}
