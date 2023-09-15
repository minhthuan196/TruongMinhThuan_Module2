package bai10_DSA_danh_sach.thuc_hanh.th1_list;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.println(listInteger);
        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

    }
}
