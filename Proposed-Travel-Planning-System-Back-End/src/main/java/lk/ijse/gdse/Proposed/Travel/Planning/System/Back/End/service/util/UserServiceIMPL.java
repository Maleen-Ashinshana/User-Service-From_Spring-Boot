package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceIMPL implements UserService {
    @Autowired
    private Convert convert;
    @Autowired
    private UserRepository  userRepository;



    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return convert.toUserDTO(userRepository.save(convert.toUserEntity(userDTO)));
    }

    @Override
    public UserDTO getSelectedUser(String id) {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
