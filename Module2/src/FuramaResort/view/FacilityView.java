package FuramaResort.view;

import FuramaResort.controller.FacilityController;
import FuramaResort.model.facility.Facility;
import FuramaResort.model.facility.House;
import FuramaResort.model.facility.Room;
import FuramaResort.model.facility.Villa;
import FuramaResort.utils.RegexUtil;
import FuramaResort.utils.ConfirmUtil;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private final FacilityController facilityController = new FacilityController();
    private final ConfirmUtil confirmUtil = new ConfirmUtil();
    private final PersonView personView = new PersonView();
    private final Scanner scanner = new Scanner(System.in);
    private final RegexUtil regexUtil = new RegexUtil();
    private static final String ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String ID_ROOM = "^SVRO-[0-9]{4}$";
    private static final String ID_HOUSE = "^SVHO-[0-9]{4}$";

    public void managementFacility() {
        do {
            switch (chooseMenuFacility()) {
                case 1:
                    System.out.println("key: " + this.facilityController.showFacility().keySet() + "value: " + this.facilityController.showFacility().values());
                    break;
                case 2:
                    Facility facility = createFacilityView();
                    if (facility != null) {
                        this.facilityController.createFacility(facility);
                        System.out.println("Create Facility done");
                    }
                    break;
                case 3:
                    Map<Facility, Integer> facilities = this.facilityController.showFacilityMaintenance();
                    if (facilities.size() == 0) {
                        System.out.println("There are no services that require maintenance");
                    } else {
                        System.out.println(facilities);
                    }
                    break;
                case 4:
                    String idFacility = inputIdFacilityRemove();
                    Facility facilityRemove = getFacilityRemove(idFacility);
                    if (facilityRemove == null) {
                        System.out.println("Facility with ID " + idFacility + " not find");
                    } else {
                        System.out.println(facilityRemove);
                        deleteFacility(idFacility);
                    }
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

    private Facility createFacilityView() {
        switch (chooseAddFacility()) {
            case 1:
                return createVilla();
            case 2:
                return createHouse();
            case 3:
                return createRoom();
            case 4:
                return null;
        }
        return null;
    }

    private Facility createHouse() {
        House house = new House();
        house.setIdService(inputIdServiceHouse());
        inputInformationFacility(house);
        house.setRoomStandards(inputRoomStandards());
        house.setNumberOfFloors(inputNumberFloors());
        return house;
    }

    private String inputIdServiceHouse() {
        String idServiceHouse;
        do {
            System.out.println("Enter ID service House (SVHO-1234):");
            idServiceHouse = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceHouse, ID_HOUSE)) {
                return idServiceHouse;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }

    private String inputIdServiceRoom() {
        String idServiceRoom;
        do {
            System.out.println("Enter ID service Room (SVRO-1234):");
            idServiceRoom = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceRoom, ID_ROOM)) {
                return idServiceRoom;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }

    private String inputFreeService() {
        String freeService;
        do {
            System.out.println("Enter free Service Included: ");
            freeService = scanner.nextLine();
            if (freeService.equalsIgnoreCase("")) {
                System.out.println("Not be empty. Enter again!!!");
            } else {
                break;
            }
        } while (true);
        return freeService;
    }

    private Facility createRoom() {
        Room room = new Room();
        room.setIdService(inputIdServiceRoom());
        inputInformationFacility(room);
        room.setFreeServiceIncluded(inputFreeService());
        return room;
    }

    private String inputIdServiceVilla() {
        String idServiceVilla;
        do {
            System.out.println("Enter ID service Villa (SVVL-1234):");
            idServiceVilla = scanner.nextLine();
            if (this.regexUtil.validateString(idServiceVilla, ID_VILLA)) {
                return idServiceVilla;
            } else {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }

    private double inputPoolArea() {
        double poolArea;
        do {
            try {
                System.out.println("Enter pool area (>30m2): ");
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.out.println("Pool Area >30 m2. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!!!");
            }
        } while (true);
        return poolArea;
    }

    private Facility createVilla() {
        Villa villa = new Villa();
        villa.setIdService(inputIdServiceVilla());
        inputInformationFacility(villa);
        villa.setRoomStandards(inputRoomStandards());
        villa.setNumberOfFloors(inputNumberFloors());
        villa.setPoolArea(inputPoolArea());
        return villa;
    }

    private String inputIdFacilityRemove() {
        String idFacility;
        do {
            System.out.println("Enter id Facility need remove (SVVL-1234 or SVHO-1234 or SVRO-1234): ");
            idFacility = scanner.nextLine();
            if (regexUtil.validateString(idFacility, ID_VILLA) || regexUtil.validateString(idFacility, ID_HOUSE) || regexUtil.validateString(idFacility, ID_ROOM)) {
                return idFacility;
            } else {
                System.out.println("Invalid. Enter again!!!");
            }
        } while (true);
    }

    private Facility getFacilityRemove(String idFacility) {
        for (Map.Entry<Facility, Integer> entry : this.facilityController.showFacility().entrySet()) {
            if (entry.getKey().getIdService().equalsIgnoreCase(idFacility)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private void menuAddFacility() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
    }

    private String inputNameService() {
        String name;
        do {
            System.out.println("Enter name service (Special Service):");
            name = scanner.nextLine();
            if (personView.checkName(name)) {
                break;
            } else {
                System.out.println("Invalid. Enter again!!!");
            }
        } while (true);
        return name;
    }

    private double inputUsableArea() {
        double usableArea;
        do {
            try {
                System.out.println("Enter usable area (>=30m2):");
                usableArea = Double.parseDouble(scanner.nextLine());
                if (usableArea > 30) {
                    return usableArea;
                } else {
                    System.out.println("Usable area >=30m2. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Enter again!!!");
            }
        } while (true);
    }

    private int inputRentalCosts() {
        int rentalCosts;
        do {
            try {
                System.out.println("Enter rental costs (>0): ");
                rentalCosts = Integer.parseInt(scanner.nextLine());
                if (rentalCosts > 0) {
                    break;
                } else {
                    System.out.println("Rental costs >0. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Enter again");
            }
        } while (true);
        return rentalCosts;
    }

    private int inputMaximumPeople() {
        int maximumPeople;
        do {
            try {
                System.out.println("Enter maximum People (>0 && <20): ");
                maximumPeople = Integer.parseInt(scanner.nextLine());
                if (maximumPeople <= 0 || maximumPeople >= 20) {
                    System.out.println("Maximum people (>0 && <20). Enter again!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Enter again!!!");
            }
        } while (true);
        return maximumPeople;
    }

    private String inputRentalTypeFacility() {
        int choiceRentalType;
        do {
            try {
                System.out.println("Choose rental type (Year/Month/Date/Hours): ");
                System.out.println("1.Year");
                System.out.println("2.Month");
                System.out.println("3.Date");
                System.out.println("4.Hours");
                choiceRentalType = Integer.parseInt(scanner.nextLine());
                if (choiceRentalType <= 0 || choiceRentalType > 4) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid.Choose again!!!");
            }
        } while (true);
        if (choiceRentalType == 1) {
            return "Year";
        } else if (choiceRentalType == 2) {
            return "Month";
        } else if (choiceRentalType == 3) {
            return "Date";
        } else {
            return "Hours";
        }
    }

    public String inputRoomStandards() {
        String name;
        do {
            System.out.println("Enter room standards (Special Room Standards):");
            name = scanner.nextLine();
            if (personView.checkName(name)) {
                break;
            } else {
                System.out.println("Invalid. Enter again!!!");
            }
        } while (true);
        return name;
    }

    public int inputNumberFloors() {
        int numberFloors;
        do {
            try {
                System.out.println("Enter number of floors (>0): ");
                numberFloors = Integer.parseInt(scanner.nextLine());
                if (numberFloors > 0) {
                    return numberFloors;
                } else {
                    System.out.println("Floors >0. Enter again!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid.Enter again!!!");
            }
        } while (true);
    }

    public void inputInformationFacility(Facility facility) {
        facility.setNameService(inputNameService());
        facility.setUsableArea(inputUsableArea());
        facility.setRentalCosts(inputRentalCosts());
        facility.setMaximumNumberOfPeople(inputMaximumPeople());
        facility.setRentalType(inputRentalTypeFacility());
    }

    private int chooseAddFacility() {
        int choose;
        do {
            try {
                this.menuAddFacility();
                System.out.println("Choose option in Menu Add Facility:");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose <= 0 || choose > 4) {
                    System.out.println("Not in Menu. Choose again!!!");
                } else {
                    return choose;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Choose again!!!");
            }
        } while (true);
    }

    private int chooseMenuFacility() {
        int chooseMenuFacility;
        do {
            try {
                this.displayFacility();
                System.out.println("Choose option in Menu Facility:");
                chooseMenuFacility = Integer.parseInt(scanner.nextLine());
                if (chooseMenuFacility <= 0 || chooseMenuFacility > 5) {
                    System.out.println("Not in Menu. Choose again!!!!");
                } else {
                    return chooseMenuFacility;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Choose again!!!!");
            }
        } while (true);
    }

    private void deleteFacility(String idFacility) {
        int confirm = confirmUtil.getConfirm(idFacility);
        switch (confirm) {
            case 1:
                this.facilityController.removeFacility(getFacilityRemove(idFacility));
                System.out.println("Facility with ID: " + idFacility + " remove done!!!");
                break;
            case 2:
                System.out.println("Cancel delete!!!");
                break;
        }
    }

    private void displayFacility() {
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }
}
