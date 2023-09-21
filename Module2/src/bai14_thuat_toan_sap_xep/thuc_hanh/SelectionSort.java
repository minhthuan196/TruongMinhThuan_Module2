package bai14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {
    public static void sortSelection(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 5, 9, 8, 6, 0};
        sortSelection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
