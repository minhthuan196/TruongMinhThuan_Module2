package bai_tap_them.ss2;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int totalDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                totalDivisors += i;
            }
        }
        System.out.println("Total divisors of " + number + " : " + totalDivisors);
    }
}
