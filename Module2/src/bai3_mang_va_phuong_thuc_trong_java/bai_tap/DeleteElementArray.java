package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {0, 5, 6, 2, 3, 6, 0, 0, 7, 6, 9, 0};
        System.out.print("Array value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
        System.out.println("\nEnter number need delete: ");
        int number = scanner.nextInt();
        String indexDelete = "";
        for (int i = 0; i < arrayNumber.length; i++) {
            if (number == arrayNumber[i]) {
                indexDelete += i + " ";
            }
        }
        int last = arrayNumber.length;
        for (int i = 0; i < last; i++) {
            if (number == arrayNumber[i]) {
                for (int j = i; j < arrayNumber.length - 1; j++) {
                    arrayNumber[j] = arrayNumber[j + 1];
                }
                arrayNumber[arrayNumber.length - 1] = 0;
                i--;
                last--;
            }
        }
        if (indexDelete.equals("")) {
            System.out.println(number + " not find in array");
        } else {
            System.out.println(number + " has index in array: " + indexDelete);
        }
        System.out.print("Array new value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
    }
}
