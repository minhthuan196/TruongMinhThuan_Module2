package FuramaResort.service.impl;

import FuramaResort.model.facility.Facility;
import FuramaResort.repository.IFacilityRepository;
import FuramaResort.repository.impl.FacilityRepository;
import FuramaResort.service.IFacilityService;
import java.util.Map;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> showFacility() {
        return facilityRepository.showFacility();
    }

    @Override
    public void createFacility(Facility key) {
        facilityRepository.createFacility(key);
    }

    @Override
    public Map<Facility, Integer> showFacilityMaintenance() {
        return facilityRepository.showFacilityMaintenance();
    }

    @Override
    public void removeFacility(Facility key) {
        facilityRepository.removeFacility(key);
    }
}
