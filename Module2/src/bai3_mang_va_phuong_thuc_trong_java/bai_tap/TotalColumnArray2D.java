package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TotalColumnArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber;
        int columnNumber;

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
            columnNumber = scanner.nextInt();
            if (columnNumber > 0) {
                break;
            } else {
                System.out.println("Enter column Array > 0");
            }
        } while (true);
        double[][] arrayNumber = new double[rowNumber][columnNumber];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = new double[columnNumber];
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                arrayNumber[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Array 2D: ");
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                System.out.print(arrayNumber[i][j] + "\t");
            }
            System.out.print("\n");
        }
        double totalColumn = 0;
        int column;
        do {
            System.out.println("Enter column need add sum (>=0 and <" + columnNumber + "): ");
            column = scanner.nextInt();
            if (column >= 0 && column < columnNumber) {
                break;
            } else {
                System.out.println("Enter again!!");
            }
        } while (true);
        for (int j = 0; j < arrayNumber.length; j++) {
            totalColumn += arrayNumber[j][column];
        }
        System.out.println("Total column " + column + " = " + totalColumn);
    }
}
