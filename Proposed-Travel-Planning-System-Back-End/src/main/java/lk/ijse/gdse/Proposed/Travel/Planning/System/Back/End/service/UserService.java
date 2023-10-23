package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO getSelectedUser(String id);
    /*UserDTO getByName(String name);*/
    void  updateUser(String user_id,UserDTO userDTO);
    void deleteUser(String id);
    List<UserDTO> getAllUsers();
    /*List<UserDTO> getUserByName(String user_name);*/
}
