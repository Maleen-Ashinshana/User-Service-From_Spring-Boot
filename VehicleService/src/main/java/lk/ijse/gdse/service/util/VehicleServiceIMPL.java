package lk.ijse.gdse.service.util;

import lk.ijse.gdse.Proposed.Travel.Planning.System.Back.End.converter.Convert;
import lk.ijse.gdse.dto.VehicleDTO;
import lk.ijse.gdse.repo.VehicleRepo;
import lk.ijse.gdse.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleServiceIMPL implements VehicleService {
    @Autowired
    private Convert convert;
    @Autowired
    private VehicleRepo vehicleRepo;
    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
        return null;
    }

    @Override
    public VehicleDTO getSelectedVehicle(String vehicle_id) {
        return null;
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {

    }

    @Override
    public void deleteVehicle(String vehicle_id) {

    }
}
