package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.api;

import jakarta.validation.Valid;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.BillDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.BillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/bill")
@CrossOrigin("*")
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/{user_id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveBill(
            @PathVariable String user_id,
            @RequestPart String date){

        BillDTO billDTO=new BillDTO();
        billDTO.setDate(date);
        return billService.saveBill(user_id,billDTO).getUser_id();

//        return billService.saveBill(user_id,billDTO);
    }
    @GetMapping(value = "/{bill_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    BillDTO getBill(@Valid @PathVariable String bill_id){
        return billService.getSelectBill(bill_id);
    }

    @DeleteMapping(value = "/{bill_id}")
    void deleteBill(@Valid @PathVariable String bill_id){
     billService.deleteBill(bill_id);
    }

    @PatchMapping("/{bill_id}")
    void updateBill(@Valid @PathVariable String bill_id,@RequestBody BillDTO billDTO){
        billDTO.setBill_id((bill_id));
        billService.updateBill((billDTO));

    }
}
