package bai13_thuan_toan_tim_kiem.bai_tap.bt2_binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element number of array:  ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arrayNumber = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter element at " + i + " of Array: ");
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array: ");
        for (int j : arrayNumber) {
            System.out.print(j + "\t");
        }
        sortArrayNumber(arrayNumber);
        System.out.println("\nArray after sort: ");
        for (int j : arrayNumber) {
            System.out.print(j + "\t");
        }
        System.out.println("\nEnter number need find: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Index of " + number1 + ": "
                + binarySearch(arrayNumber, number1, 0, arrayNumber.length - 1));
    }

    public static int[] sortArrayNumber(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    int temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[j];
                    arrayNumber[j] = temp;
                }
            }
        }
        return arrayNumber;
    }

    public static int binarySearch(int[] arrayNumber, int x, int low, int high) {
        if (arrayNumber.length == 0 || low > high) {
            return -1;
        }
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arrayNumber[mid] == x) {
                return mid;
            }
            if (x > arrayNumber[mid]) {
                return binarySearch(arrayNumber, x, mid + 1, high);
            } else {
                return binarySearch(arrayNumber, x, low, mid - 1);
            }
        }
        return -1;
    }
}
