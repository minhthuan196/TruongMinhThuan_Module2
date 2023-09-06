package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
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
        System.out.print("Elements in array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        int last = array.length - 1;
        for (int i = 0; i < last; i++) {
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;
            last--;
        }
        System.out.print("\nReverse array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
