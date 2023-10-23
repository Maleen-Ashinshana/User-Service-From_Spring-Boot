package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.exception.NotFoundException;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
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
        Optional<UserEntity> byId = userRepository.findById(id);
        if (!byId.isPresent()){
            throw new NotFoundException("The User id cannot be found :"+id);
        }
        return convert.toUserDTO(byId.get());
    }

   /* @Override
    public UserDTO getByName(String name) {

    }*/


    @Override
    public void updateUser(String user_id,UserDTO userDTO) {
        Optional<UserEntity> user=userRepository.findById(user_id);
        if (!user.isPresent()){
            throw new NotFoundException("The User id cannot be found :"+user_id);
//            user.get().setUser_name(userDTO.getUser_name());
//            user.get().setEmail(userDTO.getEmail());
//            user.get().setUser_registration_time(userDTO.getUser_registration_time());
//            user.get().setEmail(userDTO.getEmail());
//            user.get().setAddress(userDTO.getAddress());
//            user.get().setPassword(userDTO.getPassword());
//            user.get().setNic_or_passport_number(userDTO.getNic_or_passport_number());
//            user.get().setProfile_picture(userDTO.getProfile_picture());
        }
        UserEntity userEntity=user.get();
        userEntity.setUser_name(userDTO.getUser_name());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setUser_registration_date(userDTO.getUser_registration_date());
        userEntity.setAddress(userDTO.getAddress());
        userEntity.setPassword(userDTO.getPassword());
        /*userEntity.getGender(userDTO.getGender());*/
        userEntity.setNic_or_passport_number(userDTO.getNic_or_passport_number());
        userEntity.setProfile_picture(userDTO.getProfile_picture());

        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(String user_id) {
        Optional<UserEntity> byId = userRepository.findById(user_id);
        if (!byId.isPresent()){
            throw new NotFoundException("The User id cannot be found :"+user_id);
        }
        userRepository.deleteById(user_id);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(user->convert.toUserDTO(user)).collect(Collectors.toList());
//        return userRepository.findAll().stream().map(::toUserDto).collect(Collectors.toList());
    }

  /*  @Override
    public List<UserDTO> getUserByName(String user_name) {
        Optional<UserEntity> byUsername = userRepository.findByUsername(user_name);
        if (!byUsername.isPresent()) {
            throw new NotFoundException("The User with username cannot be found: " + user_name);
        }
        return Collections.singletonList(convert.toUserDTO(byUsername.get()));
    }*/
}
