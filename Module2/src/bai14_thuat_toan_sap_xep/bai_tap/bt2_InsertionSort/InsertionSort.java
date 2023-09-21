package bai14_thuat_toan_sap_xep.bai_tap.bt2_InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void sortInsertion(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            x = arr[i];
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 5, 9, 8, 6, 0};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
