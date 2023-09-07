package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = new int[]{1, 3, 4, 6, 7, 8, 6, 5, 3, 8, 0, 0};

        System.out.print("Array value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }

        System.out.println("\nEnter number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter Index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= arrayNumber.length - 1) {
            for (int i = arrayNumber.length - 1; i > index; i--) {
                arrayNumber[i] = arrayNumber[i - 1];
            }
            arrayNumber[index] = inputNumber;
        } else {
            System.out.println("Not add to the array!");
        }
        System.out.print("Array new value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
    }
}
