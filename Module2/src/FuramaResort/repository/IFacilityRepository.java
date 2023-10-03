package FuramaResort.repository;

import FuramaResort.model.facility.Facility;
import java.util.Map;


public interface IFacilityRepository {
    Map<Facility, Integer> showFacility();

    void createFacility(Facility key);

    Map<Facility, Integer> showFacilityMaintenance();

    void removeFacility(Facility key);
}
