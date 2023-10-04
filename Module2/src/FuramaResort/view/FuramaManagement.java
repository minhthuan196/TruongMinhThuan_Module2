package FuramaResort.view;

import java.util.Scanner;

public class FuramaManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeView employeeView = new EmployeeView();
    private final CustomerView customerView = new CustomerView();
    private final FacilityView facilityView = new FacilityView();
    private final PromotionView promotionView = new PromotionView();
    private final BookingView bookingView = new BookingView();

    public void managementFurama() {
        do {
            switch (chooseMenu()) {
                case 1:
                    employeeView.managementEmployee();
                    break;
                case 2:
                    customerView.managementCustomer();
                    break;
                case 3:
                    facilityView.managementFacility();
                    break;
                case 4:
                    bookingView.managementBooking();
                    break;
                case 5:
                    promotionView.managementPromotion();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        } while (true);
    }

    private int chooseMenu() {
        int chooseOption;
        do {
            try {
                this.displayMainMenu();
                System.out.println("Choose option in Menu:");
                chooseOption = Integer.parseInt(scanner.nextLine());
                if (chooseOption <= 0 || chooseOption > 6) {
                    System.out.println("Not in Menu. Choose again!!!!");
                } else {
                    return chooseOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!!!!");
            }
        } while (true);
    }

    private void displayMainMenu() {
        System.out.println("==========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }
}
