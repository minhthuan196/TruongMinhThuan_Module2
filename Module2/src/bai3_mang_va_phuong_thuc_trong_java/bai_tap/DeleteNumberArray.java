package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Array value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
        System.out.println("\nEnter number need delete: ");
        int number = scanner.nextInt();
        int indexDelete = -1;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (number == arrayNumber[i]) {
                indexDelete = i;
            }
        }
        for (int i = indexDelete; i < arrayNumber.length - 1; i++) {
            arrayNumber[i] = arrayNumber[i + 1];
        }
        arrayNumber[arrayNumber.length - 1] = 0;

        System.out.print("Array new value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
    }
}
