package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.sql.rowset.serial.SerialStruct;
import java.time.LocalDate;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(@Valid
            @RequestPart String userName,
            @RequestPart String userAddress,
            @RequestPart String registerDate,
            @RequestPart String userEmail,
            @RequestPart String userAge,
            @RequestPart String contact_number,
            @RequestPart String userGender,
            @RequestPart String userPassword,
            @RequestPart String userNIC,
            @RequestPart String remark,
            @RequestPart byte[] userProfile
            ){

        String profile= Base64.getEncoder().encodeToString(userProfile);
       /* registerDate=LocalDate.now();*/
       /* @NotNull(message = "user register cannot be empty") LocalDate date=registerDate.toString();*/
        UserDTO userDTO=new UserDTO();
        userDTO.setUser_name(userName);
        userDTO.setAddress(userAddress);
        userDTO.setUser_registration_date(LocalDate.parse(registerDate));
        userDTO.setEmail(userEmail);
        userDTO.setAge(userAge);
        userDTO.setContact_number(contact_number);
        userDTO.setGender(userGender);
        userDTO.setPassword(userPassword);
        userDTO.setNic_or_passport_number(userNIC);
        userDTO.setRemark(remark);
        userDTO.setProfile_picture(profile);

        return userService.saveUser(userDTO);
    }
    @RequestMapping("/test")
    @PostMapping()

    public String testSave(){
        /*System.out.println("");*/
        String test="Test";
        return test;
    }
    @GetMapping(value ="/{user_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    UserDTO getSelectUser(@PathVariable String user_id){
        return userService.getSelectedUser(user_id);
    }

    /*@GetMapping(value = "/{user_name}",produces = MediaType.APPLICATION_JSON_VALUE)
    UserDTO getUserByUserName(@PathVariable String user_name){
        System.out.println(user_name+"******");
        return (UserDTO) userService.getUserByName(user_name);
    }*/


    @DeleteMapping(value = "/{user_id}")
    void deleteUser( @RequestPart String user_id){
         System.out.println(user_id+"*****");
        userService.deleteUser(user_id);
     }
     @PatchMapping(value = "/{user_id}")
    public String updateUser(
            @PathVariable String user_id,
            @RequestPart String userName,
            @RequestPart String userAddress,
            @RequestPart String userRegisterDate,
            @RequestPart String userEmail,
            @RequestPart String userAge,
            @RequestPart String contact_number,
            @RequestPart String gender,
            @RequestPart String userPassword,
            @RequestPart String userNIC,
            @RequestPart String remark,
            @RequestPart byte[] userProfile

     ){
         String profile= Base64.getEncoder().encodeToString(userProfile);
         UserDTO userDTO=new UserDTO();
         userDTO.setUser_name(userName);
         userDTO.setAddress(userAddress);
         userDTO.setUser_registration_date(LocalDate.parse(userRegisterDate));
         userDTO.setEmail(userEmail);
         userDTO.setAge(userAge);
         userDTO.setContact_number(contact_number);
         userDTO.setGender(gender);
         userDTO.setPassword(userPassword);
         userDTO.setNic_or_passport_number(userNIC);
         userDTO.setRemark(remark);
         userDTO.setProfile_picture(profile);

         userService.updateUser(user_id,userDTO);
         return String.valueOf(new ResponseEntity<>(HttpStatus.OK));

     }
     @GetMapping
    public  ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> userDTOS=userService.getAllUsers();
        return new ResponseEntity<>(userDTOS,HttpStatus.OK);
     }
}
