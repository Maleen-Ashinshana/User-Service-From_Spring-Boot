package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.AdminDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
   @GetMapping(value = "{admin_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    AdminDTO getSelectedAdmin(@PathVariable String admin_id){
        return adminService.getSelectedAdmin(admin_id);
   }
   @DeleteMapping(value = "{admin_id}")
    void deleteAdmin(@RequestPart String admin_id){
        adminService.deleteAdmin(admin_id);
   }
   @PatchMapping("{admin_id}")
    void  updateAdmin(@PathVariable String admin_id,@RequestBody AdminDTO adminDTO){
        adminDTO.setAdmin_id(admin_id);
        adminService.updateAdmin(adminDTO);
   }

}
