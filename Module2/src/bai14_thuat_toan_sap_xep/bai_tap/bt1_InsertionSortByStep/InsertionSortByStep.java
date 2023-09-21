package bai14_thuat_toan_sap_xep.bai_tap.bt1_InsertionSortByStep;

import java.util.Arrays;

public class InsertionSortByStep {
    public static void sortInsertion(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            System.out.println("pos = " + i);
            x = arr[i];
            System.out.println("x = " + x);
            while (pos > 0 && x < arr[pos - 1]) {
                System.out.println("arr[" + pos + "] = " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("arr[" + pos + "] = " + x);
            System.out.println("Array at i = " + i + ": " + Arrays.toString(arr));
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 5, 9, 8, 6, 0};
        sortInsertion(arr);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}
