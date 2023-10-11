package lk.ijse.gdse.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.dto.GuiderDTO;
import lk.ijse.gdse.repo.GuideRepo;
import lk.ijse.gdse.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleServiceIMPL implements GuideService {
    @Autowired
    private Convert convert;
    @Autowired
    private GuideRepo vehicleRepo;

    @Override
    public GuiderDTO saveGuide(GuiderDTO vehicleDTO) {
        return null;
    }

    @Override
    public GuiderDTO getGuide(String guide_id) {
        return null;
    }

    @Override
    public void updateGuide(GuiderDTO guiderDTO) {

    }

    @Override
    public void deleteGuide(String guide_id) {

    }
}
