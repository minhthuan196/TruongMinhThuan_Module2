package FuramaResort.controller;

import FuramaResort.model.facility.Facility;
import FuramaResort.service.IFacilityService;
import FuramaResort.service.impl.FacilityService;

import java.util.LinkedHashMap;

public class FacilityController {

    private final IFacilityService facilityService = new FacilityService();

    public LinkedHashMap<Facility, Integer> showFacility() {
        return facilityService.showFacility();
    }

    public void createFacility(Facility key) {
        facilityService.createFacility(key);
    }


    public LinkedHashMap<Facility, Integer> showFacilityMaintenance() {
        return facilityService.showFacilityMaintenance();
    }


    public void removeFacility(Facility key) {
        facilityService.removeFacility(key);
    }
}
