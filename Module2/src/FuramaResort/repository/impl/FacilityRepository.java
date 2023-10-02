package FuramaResort.repository.impl;

import FuramaResort.model.facility.Facility;
import FuramaResort.model.facility.House;
import FuramaResort.model.facility.Room;
import FuramaResort.model.facility.Villa;
import FuramaResort.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();

    static {
        facilityLinkedHashMap.put(new House("SVHO-1234", "Vip One", 32, 12, 10, "Year", "Vip", 10), 5);
        facilityLinkedHashMap.put(new Villa("SVVL-1234", "Vip One", 32, 12, 10, "Year", "Vip", 23, 10), 5);
        facilityLinkedHashMap.put(new Room("SVRO-1234", "Vip One", 32, 12, 10, "Year", "An uong"), 0);
    }

    @Override
    public LinkedHashMap<Facility, Integer> showFacility() {
        return facilityLinkedHashMap;
    }

    @Override
    public void createFacility(Facility key) {
        facilityLinkedHashMap.put(key, 0);
    }

    @Override
    public LinkedHashMap<Facility, Integer> showFacilityMaintenance() {
        LinkedHashMap<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityLinkedHashMap.entrySet()) {
            if (entry.getValue() == 5) {
                facilityMaintenance.put(entry.getKey(), entry.getValue());
            }
        }
        return facilityMaintenance;
    }

    @Override
    public void removeFacility(Facility key) {
        for (Map.Entry<Facility, Integer> entry : facilityLinkedHashMap.entrySet()) {
            if (entry.getKey().equals(key)) {
                facilityLinkedHashMap.remove(entry.getKey());
                break;
            }
        }
    }
}
