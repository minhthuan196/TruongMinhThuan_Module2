package bai4_lop_va_doi_tuong_java.bai_tap.b1_phuong_trinh_bac_2;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("Enter number a: ");
            a = scanner.nextDouble();
            if (a != 0) {
                break;
            } else {
                System.out.println("a must be different from 0 !!");
            }
        } while (true);
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.showResult());
    }
}
