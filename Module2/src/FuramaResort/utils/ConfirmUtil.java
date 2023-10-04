package FuramaResort.utils;

import java.util.Scanner;

public class ConfirmUtil {
    private final Scanner scanner = new Scanner(System.in);

    public int getConfirm(String id) {
        int confirm;
        do {
            try {
                System.out.println("Do you want delete ID: " + id + " ? (Yes/No)");
                System.out.println("1,Yes");
                System.out.println("2,No");
                confirm = Integer.parseInt(scanner.nextLine());
                if (confirm <= 0 || confirm > 2) {
                    System.out.println("Not in Menu.Choose again!!");
                } else {
                    return confirm;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid!!!");
            }
        } while (true);
    }
}
