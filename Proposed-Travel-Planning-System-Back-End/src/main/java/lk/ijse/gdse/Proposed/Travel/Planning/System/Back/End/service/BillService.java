package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.BillDTO;

public interface BillService {
    BillDTO saveBill(String user_id,BillDTO billDTO);
    BillDTO getSelectBill(String bill_id);
    void  updateBill(BillDTO billDTO);
    void deleteBill(String bill_id);
}
