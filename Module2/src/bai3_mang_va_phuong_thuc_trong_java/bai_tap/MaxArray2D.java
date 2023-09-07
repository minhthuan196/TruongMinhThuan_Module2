package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber;
        int colNumber;

        do {
            System.out.println("Enter row Array: ");
            rowNumber = scanner.nextInt();
            if (rowNumber > 0) {
                break;
            } else {
                System.out.println("Enter row Array > 0");
            }
        } while (true);
        do {
            System.out.println("Enter column Array: ");
            colNumber = scanner.nextInt();
            if (colNumber > 0) {
                break;
            } else {
                System.out.println("Enter column Array > 0");
            }
        } while (true);
        double[][] arrayNumber = new double[rowNumber][colNumber];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = new double[colNumber];
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                arrayNumber[i][j] = scanner.nextDouble();
            }
        }
        double max = arrayNumber[0][0];
        System.out.println("Array 2D: ");
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.print(arrayNumber[i][j] + "\t");
                if (max < arrayNumber[i][j]) {
                    max = arrayNumber[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Max array 2D: " + max);
    }
}
