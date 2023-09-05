package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String[] lessThan10 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] lessThan20 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] dozen = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "nicety"};
        String[] hundred = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nice hundred"};

        int unitNumber = number % 10;
        int dozenNumber = number / 10;
        int hundredNumber = number / 100;
        String result;

        if (number >= 0 && number < 10) {
            result = lessThan10[number];
        } else if (number < 20) {
            result = lessThan20[unitNumber];
        } else if (number < 100) {
            result = dozen[dozenNumber];
            if (unitNumber > 0) {
                result += " " + lessThan10[unitNumber];
            }
        } else if (number < 1000) {

            result = hundred[hundredNumber];
            int dozenNumber1 = dozenNumber % 10;

            if (dozenNumber1 == 0 && unitNumber > 0) {
                result += " " + lessThan10[unitNumber];
            } else if (dozenNumber1 == 1) {
                result += " " + lessThan20[unitNumber];
            } else {
                result += " " + dozen[dozenNumber1];
                if (unitNumber > 0) {
                    result += " " + lessThan10[unitNumber];
                }
            }
        } else {
            result = "out of ability";
        }
        System.out.println(number + ": " + result);
    }
}
