package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.BillDTO;

public interface BillService {
    BillDTO saveBill(BillDTO billDTO);
    BillDTO getSelectBill(String bill_id);
    void  updateBill(String bill_id);
    void deleteBill(String bill_id);
}
