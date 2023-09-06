package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array;
        int size;
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 0 && size <= 20) {
                break;
            } else {
                System.out.println("Size does not exceed 20 and greater than 0");
            }
        } while (true);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i : array) {
            System.out.print(i + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);

    }
}
