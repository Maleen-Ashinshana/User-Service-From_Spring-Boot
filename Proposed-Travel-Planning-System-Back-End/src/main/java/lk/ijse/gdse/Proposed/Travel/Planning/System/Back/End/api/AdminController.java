package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.AdminDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin("*")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json", produces = "application/json")
    AdminDTO save(@Valid @RequestBody AdminDTO adminDTO, Errors errors){
        /*if (errors. hasFieldErrors()){
               throw new ResponseStatusException(HttpStatus.BAD_REQUEST,errors.getFieldErrors().get(0).getDefaultMessage()
               );
        }*/
        System.out.println(adminDTO.getUser_id()+ "Controller");
        System.out.println(adminDTO.getUserName()+ "Controller");
        System.out.println(adminDTO.getPassword()+ "Controller");
        return adminService.saveAdmin(adminDTO);

    }
/* @ResponseStatus(HttpStatus.CREATED)
 @PostMapping(consumes = "application/json", produces = "application/json")
 AdminDTO save(@Valid @RequestBody AdminDTO adminDTO, Errors errors) {
     *//*if (errors.hasFieldErrors()) {
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.getFieldErrors().get(0).getDefaultMessage());
     }*//*
     *//*if (adminDTO.getUserName() == null || adminDTO.getUserName().isEmpty()) {
         throw new IllegalArgumentException("Admin name cannot be empty");
     }*//*
     System.out.println(adminDTO.getUserName());
     return adminService.saveAdmin(adminDTO);
 }*/

    /*@PostMapping("/save")
    public ResponseEntity<String> saveAdmin(@Valid @RequestBody AdminDTO adminDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            List<ObjectError> errors = bindingResult.getAllErrors();
            List<String> errorMessages = new ArrayList<>();
            for (ObjectError error : errors) {
                errorMessages.add(error.getDefaultMessage());
            }
            return new ResponseEntity<>(errorMessages.toString(), HttpStatus.BAD_REQUEST);
        } else {
            // Proceed with saving the admin
            // ...
            return new ResponseEntity<>("Admin saved successfully", HttpStatus.OK);
        }
    }*/

}
