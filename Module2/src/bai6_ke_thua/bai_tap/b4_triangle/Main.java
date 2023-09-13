package bai6_ke_thua.bai_tap.b4_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double numberA = scanner.nextDouble();
        System.out.println("Enter b: ");
        double numberB = scanner.nextDouble();
        System.out.println("Enter c: ");
        double numberC = scanner.nextDouble();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle();
        triangle.setSide1(numberA);
        triangle.setSide2(numberB);
        triangle.setSide3(numberC);
        triangle.setColor(color);
        triangle.setFilled(true);
        System.out.println(triangle);
        triangle = new Triangle(numberA, numberB, numberC);
        System.out.println(triangle);
        triangle = new Triangle(color, true, numberA, numberB, numberC);
        System.out.println(triangle);
    }
}
