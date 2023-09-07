package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberArray1;
        do {
            System.out.println("Enter number Array 1: ");
            numberArray1 = scanner.nextInt();
            if (numberArray1 > 0) {
                break;
            } else {
                System.out.println("Enter number >0");
            }
        } while (true);
        int[] array1 = new int[numberArray1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + i + " : ");
            array1[i] = scanner.nextInt();
        }
        int numberArray2;
        do {
            System.out.println("Enter number Array 2: ");
            numberArray2 = scanner.nextInt();
            if (numberArray2 > 0) {
                break;
            } else {
                System.out.println("Enter number >0");
            }
        } while (true);
        int[] array2 = new int[numberArray2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + i + " : ");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[numberArray1 + numberArray2];
        int indexArray2 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[indexArray2];
                indexArray2++;
            }
        }
        System.out.print("Array 1: ");
        for (int j : array1) {
            System.out.print(j + "\t");
        }
        System.out.print("\nArray 2: ");
        for (int j : array2) {
            System.out.print(j + "\t");
        }
        System.out.print("\nArray 3: ");
        for (int j : array3) {
            System.out.print(j + "\t");
        }
    }
}
