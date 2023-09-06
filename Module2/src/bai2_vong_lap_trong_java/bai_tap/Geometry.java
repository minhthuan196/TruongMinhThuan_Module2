package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                System.out.println("Triangle botton-left");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i >= j) {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");

                }
                System.out.println("Triangle top-left");
                for (int i = 0; i < 6; i++) {
                    for (int j = 6; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }
                System.out.println("Triangle botton-right");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (j >= 5 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
                System.out.println("Triangle top-right");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (i <= j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                int m = 5;
                int n = 5;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (j >= m && j <= n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    m--;
                    n++;
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
