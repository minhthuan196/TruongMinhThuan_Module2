package FuramaResort.view;

import java.util.Scanner;

public class BookingView {
    private final Scanner scanner = new Scanner(System.in);

    public void managementBooking() {
        do {
            switch (chooseMenuBooking()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    private int chooseMenuBooking() {
        int chooseMenuBooking;
        do {
            try {
                this.displayBooking();
                System.out.println("Choose option in Menu Booking:");
                chooseMenuBooking = Integer.parseInt(scanner.nextLine());
                if (chooseMenuBooking <= 0 || chooseMenuBooking > 6) {
                    System.out.println("Enter number in Menu Booking. Enter again!!!!");
                } else {
                    return chooseMenuBooking;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter number in Menu Booking. Enter again!!!!");
            }
        } while (true);
    }

    private void displayBooking() {
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }
}
