package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        double moneyUSD;
        final double rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money USD:");
        moneyUSD = scanner.nextDouble();

        double moneyVND = moneyUSD * rate;
        System.out.println(moneyUSD + "USD = " + moneyVND + "VND");
    }
}
