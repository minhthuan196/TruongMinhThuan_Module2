package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");

                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i <= j) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Draw the square");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                System.out.println("Draw the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
