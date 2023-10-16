package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.AdminDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    AdminDTO save(@Valid @RequestBody AdminDTO adminDTO){
        return adminService.saveAdmin(adminDTO);
    }
   @GetMapping(value = "/{admin_id}")
   ResponseEntity <AdminDTO> getAdmin(@Valid @PathVariable String admin_id){
       AdminDTO selectedAdmin = adminService.getSelectedAdmin(admin_id);
       return new ResponseEntity<>(selectedAdmin,HttpStatus.OK);
   }
   @DeleteMapping(value = "/{admin_id}")
    void deleteAdmin( @Valid @RequestPart String admin_id){
        adminService.deleteAdmin(admin_id);
   }
   @PatchMapping(value = "/{admin_id}")
    void  updateAdmin(@Valid @PathVariable String admin_id,@RequestBody AdminDTO adminDTO){
        adminService.updateAdmin(admin_id,adminDTO);
   }

}
