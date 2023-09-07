package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number prime: ");
        int number = scanner.nextInt();
        int countPrime = 0;
        int n = 2;
        int count;
        while (countPrime < number) {
            count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.print(n + " ");
                countPrime++;
            }
            n++;
        }
    }
}
