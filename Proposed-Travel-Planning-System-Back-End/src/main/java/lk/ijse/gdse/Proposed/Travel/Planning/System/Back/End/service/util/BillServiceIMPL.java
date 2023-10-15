package lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.dto.BillDTO;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.BillEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.entity.UserEntity;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.BillRepo;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.repo.UserRepository;
import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BillServiceIMPL implements BillService {

    private final Convert convert;

    private final BillRepo billRepo;
    private final UserRepository userRepository;
    @Override
    public BillDTO saveBill(String user_id,BillDTO billDTO) {
        UserEntity userEntity= userRepository.findById(user_id).orElseThrow();
        BillEntity bill=convert.toBillEntity(billDTO);
        bill.setUserEntity(userEntity);
        BillDTO BillDTO=convert.toBillDTO(billRepo.save(bill));
        System.out.println(billDTO);
        return BillDTO;
        //return convert.toBillDTO(billRepo.save(convert.toBillEntity(billDTO)));
    }

    @Override
    public BillDTO getSelectBill(String bill_id) {
        BillEntity billEntity=billRepo.findById(bill_id).orElseThrow();
        BillDTO billDTO=convert.toBillDTO(billEntity);
        billDTO.setUser_id(billEntity.getUserEntity().getUser_id());
        return billDTO;
        //return convert.toBillDTO(billRepo.findById(bill_id).get());
    }

    @Override
    public void updateBill(BillDTO billDTO) {
        Optional<BillEntity> billEntity=billRepo.findById(String.valueOf(billDTO.getBill_id()));
        if (!billEntity.isPresent()){
            billEntity.get().setDate(billDTO.getDate());
            billEntity.get().setUserEntity(billEntity.get().getUserEntity());
        }

    }

    @Override
    public void deleteBill(String bill_id) {
    billRepo.deleteById(bill_id);
    }
}
