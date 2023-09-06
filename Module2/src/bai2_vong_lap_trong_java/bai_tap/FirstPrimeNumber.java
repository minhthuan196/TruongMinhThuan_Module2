package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number prime: ");
        int number = scanner.nextInt();
        int countPrime = 0;
        int n = 2;
        while (countPrime < number) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
                countPrime++;
            }
            n++;
        }
    }
}
