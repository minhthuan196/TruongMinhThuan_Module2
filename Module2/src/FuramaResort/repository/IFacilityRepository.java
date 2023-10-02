package FuramaResort.repository;

import FuramaResort.model.facility.Facility;

import java.util.LinkedHashMap;


public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> showFacility();

    void createFacility(Facility key);

    LinkedHashMap<Facility, Integer> showFacilityMaintenance();

    void removeFacility(Facility key);
}
