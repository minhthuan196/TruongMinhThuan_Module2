package FuramaResort.controller;

import FuramaResort.model.facility.Facility;
import FuramaResort.service.IFacilityService;
import FuramaResort.service.impl.FacilityService;

import java.util.Map;

public class FacilityController {

    private final IFacilityService facilityService = new FacilityService();

    public Map<Facility, Integer> showFacility() {
        return facilityService.showFacility();
    }

    public void createFacility(Facility key) {
        facilityService.createFacility(key);
    }


    public Map<Facility, Integer> showFacilityMaintenance() {
        return facilityService.showFacilityMaintenance();
    }


    public void removeFacility(Facility key) {
        facilityService.removeFacility(key);
    }
}
