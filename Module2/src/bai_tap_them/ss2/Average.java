package bai_tap_them.ss2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        double number2 = scanner.nextInt();
        Average average = new Average();
        double greatestCommonDivisorNumber1Number2 = average.greatestCommonDivisor(number1, number2);
        double leastCommonMultipleNumber1Number2 = average.leastCommonMultiple(number1, number2);
        double averageNumber = (greatestCommonDivisorNumber1Number2 + leastCommonMultipleNumber1Number2) / 2;
        System.out.println(greatestCommonDivisorNumber1Number2);
        System.out.println(leastCommonMultipleNumber1Number2);
        System.out.println("The average of the greatest common divisor and the least common multiple: " + averageNumber);
    }

    public double greatestCommonDivisor(double a, double b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public double leastCommonMultiple(double a, double b) {
        return ((a * b) / greatestCommonDivisor(a, b));
    }
}
