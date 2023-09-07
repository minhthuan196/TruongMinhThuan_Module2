package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringChar = scanner.nextLine();
        System.out.println("Enter symbol: ");
        char symbol = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < stringChar.length(); i++) {
            if (symbol == stringChar.charAt(i)) {
                count++;
            }
        }
        System.out.println("String: " + stringChar);
        System.out.println("Total of occurrences '" + symbol + "' in the string: " + count);

    }
}
