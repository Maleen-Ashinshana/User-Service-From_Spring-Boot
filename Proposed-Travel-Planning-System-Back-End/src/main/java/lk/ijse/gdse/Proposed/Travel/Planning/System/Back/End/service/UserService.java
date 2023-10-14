package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO getSelectedUser(String id);
    UserDTO getByName(String name);
    void  updateUser(UserDTO userDTO);
    void deleteUser(String id);
}
