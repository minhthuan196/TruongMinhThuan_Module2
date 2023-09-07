package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size Array: ");
            size = scanner.nextInt();
            if (size > 0) {
                break;
            } else {
                System.out.println("Enter size array > 0");
            }
        } while (true);
        int[] arrayNumber = new int[size];
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Enter element " + i + " : ");
            arrayNumber[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int j : arrayNumber) {
            System.out.print(j + "\t");
        }
        int min = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]) {
                min = arrayNumber[i];
            }
        }
        System.out.println("\nMin in array: " + min);
    }
}
