package FuramaResort.view;

import java.util.Scanner;

public class PromotionView {
    private final Scanner scanner = new Scanner(System.in);

    public void managementPromotion() {
        do {
            switch (chooseMenuPromotion()) {
                case 1:
                case 2:
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

    private int chooseMenuPromotion() {
        int chooseMenuPromotion;
        do {
            try {
                this.displayPromotion();
                System.out.println("Choose option in Menu Promotion:");
                chooseMenuPromotion = Integer.parseInt(scanner.nextLine());
                if (chooseMenuPromotion <= 0 || chooseMenuPromotion > 3) {
                    System.out.println("Invalid. Choose again!!!!");
                } else {
                    return chooseMenuPromotion;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }

    private void displayPromotion() {
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }
}
