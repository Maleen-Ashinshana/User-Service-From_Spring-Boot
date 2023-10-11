package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.AdminDTO;

public interface AdminService {
   AdminDTO saveAdmin(AdminDTO adminDTO);
   AdminDTO getSelectedAdmin(String id);
   void  updateAdmin(AdminDTO adminDTO);
   void  deleteAdmin(String id);

   /* AdminDTO saveAdmin(String id, String userName, String password);*/

}
