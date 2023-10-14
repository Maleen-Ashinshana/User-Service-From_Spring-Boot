package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Base64;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(
            @RequestPart String userName,
            @RequestPart String userAddress,
            @RequestPart String userRegisterDate,
            @RequestPart String userEmail,
            @RequestPart String userAge,
            @RequestPart String userPassword,
            @RequestPart String userNIC,
            @RequestPart byte[] userProfile
            ){
        String profile= Base64.getEncoder().encodeToString(userProfile);
        UserDTO userDTO=new UserDTO();
        userDTO.setUser_name(userName);
        userDTO.setAddress(userAddress);
        userDTO.setUser_registration_time(userRegisterDate);
        userDTO.setEmail(userEmail);
        userDTO.setAge(Integer.parseInt(userAge));
        userDTO.setPassword(userPassword);
        userDTO.setNic_or_passport_number(userNIC);
        userDTO.setProfile_picture(profile);

        return userService.saveUser(userDTO);
    }
    @GetMapping
    ResponseEntity <UserDTO> getUsers(@Valid @RequestPart String user_id){
        UserDTO userDTO=userService.getSelectedUser(user_id);
        return userDTO!=null?ResponseEntity.ok(userDTO):ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
     @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    void deleteUser( @RequestPart String user_id){
         System.out.println(user_id+"*****");
        userService.deleteUser(user_id);
     }
     @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void  updateUser(@Valid @RequestPart String user_id ,UserDTO userDTO){
//         System.out.println(userDTO.getUser_id() + "****");
         userDTO.setUser_id(user_id);
         userService.updateUser(userDTO);
     }
}
