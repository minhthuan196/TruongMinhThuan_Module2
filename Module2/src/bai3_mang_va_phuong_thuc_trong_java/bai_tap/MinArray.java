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
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("\nMin in array: " + min);
    }
}
