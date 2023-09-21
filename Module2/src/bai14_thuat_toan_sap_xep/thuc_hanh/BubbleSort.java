package bai14_thuat_toan_sap_xep.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void sortBubble(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 5, 9, 8, 6, 0};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
