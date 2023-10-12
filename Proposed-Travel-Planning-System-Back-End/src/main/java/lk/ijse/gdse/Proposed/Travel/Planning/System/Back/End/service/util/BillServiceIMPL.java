package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.BillDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.BillService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillServiceIMPL implements BillService {
    @Override
    public BillDTO saveBill(BillDTO billDTO) {
        return null;
    }

    @Override
    public BillDTO getSelectBill(String bill_id) {
        return null;
    }

    @Override
    public void updateBill(String bill_id) {

    }

    @Override
    public void deleteBill(String bill_id) {

    }
}
