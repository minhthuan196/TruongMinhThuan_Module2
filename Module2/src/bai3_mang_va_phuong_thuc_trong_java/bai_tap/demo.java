package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 4, 0, 5, 6, 2, 0, 2};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xoá: ");
        int X = sc.nextInt();
        boolean checkNums = true;
        int index = 0;
        String strIndex = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                strIndex += i + " ";
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    checkNums = false;
                }
                i--;
            }
        }
        for (int i = (array.length - 1); i >= (array.length - index); i--) {
            array[i] = 0;
        }

        if (checkNums) {
            System.out.println("Phan tu da nhap ko co trong mang");
        } else {
            System.out.println("Mang sau khi xoa: " + Arrays.toString(array));
            System.out.println("Cac phan tử đã xoá ở các vị trí " + strIndex);
        }
    }
}
