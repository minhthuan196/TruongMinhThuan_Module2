package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TotalDiagonalArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber;
        do {
            System.out.println("Enter row Array: ");
            rowNumber = scanner.nextInt();
            if (rowNumber >= 2) {
                break;
            } else {
                System.out.println("Enter row Array > 0");
            }
        } while (true);
        double[][] arrayNumber = new double[rowNumber][rowNumber];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = new double[rowNumber];
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                arrayNumber[i][j] = scanner.nextDouble();
            }
        }
        double totalDiagonal = 0;
        System.out.println("Array 2D: ");
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.print(arrayNumber[i][j] + "\t");
                if (i == j) {
                    totalDiagonal += arrayNumber[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Total diagonal array: " + totalDiagonal);
    }
}
