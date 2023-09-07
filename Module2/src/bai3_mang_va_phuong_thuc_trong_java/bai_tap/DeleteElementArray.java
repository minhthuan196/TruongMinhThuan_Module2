package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = {5, 6, 2, 3, 6, 5, 6, 7, 6, 9};
        System.out.print("Array value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
        System.out.println("\nEnter number need delete: ");
        int number = scanner.nextInt();
        int indexDelete;
        String indexDeleteArray = "";
        for (int i = 0; i < arrayNumber.length; i++) {
            if (number == arrayNumber[i]) {
                indexDelete = i;
                System.out.println(number + " index in array " + indexDelete);
                for (int j = indexDelete; j < arrayNumber.length - 1; j++) {
                    arrayNumber[j] = arrayNumber[j + 1];
                }
                arrayNumber[arrayNumber.length - 1] = 0;
            }
        }
        System.out.print("Array new value: ");
        for (int j : arrayNumber) {
            System.out.print(j + " ");
        }
    }
}
