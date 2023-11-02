package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.UserDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }
    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestParam String username,
            @RequestParam String password
    ) {
        // Now you have the username and password in 'username' and 'password' variables
        // You can perform the necessary validation and processing here

        // For example, you can print them to the console
        System.out.println("Received username: " + username);
        System.out.println("Received password: " + password);

        // You can then respond to the client with success/failure
        return ResponseEntity.ok("{\"success\": true}");
    }
    /*@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO loginRequest) {
        String username = loginRequest.getUser_name();
        String password = loginRequest.getPassword();

        // Now you have the username and password in 'username' and 'password' variables
        // You can perform the necessary validation and processing here

        // For example, you can print them to the console
        System.out.println("Received username: " + username);
        System.out.println("Received password: " + password);

        // You can then respond to the client with success/failure
        return ResponseEntity.ok("{\"success\": true}");
    }*/
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(@Valid
            @RequestPart String userName,
            @RequestPart String userAddress,
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

     @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUser(@RequestPart String userId){

        return "OK";
     }
}
