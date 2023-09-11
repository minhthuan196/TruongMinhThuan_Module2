package bai_tap_them.ss1;

import java.util.Scanner;

public class CalculatorSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        double number2 = scanner.nextInt();
        System.out.println("Chọn phép tính: ");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("kết quả: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("kết quả: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("kết quả: " + result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println("kết quả: " + result);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }

    }
}
