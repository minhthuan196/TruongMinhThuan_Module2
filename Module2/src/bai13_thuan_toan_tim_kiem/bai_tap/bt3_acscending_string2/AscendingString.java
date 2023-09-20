package bai13_thuan_toan_tim_kiem.bai_tap.bt3_acscending_string2;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String string = input.nextLine();
        LinkedList<String> list = new LinkedList<>();

        String str;
        for (int i = 0; i < string.length(); i++) {
            str = "";
            str += string.charAt(i);
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > str.charAt(str.length() - 1)) {
                    str += string.charAt(j);
                } else {
                    break;
                }
            }
            list.add(str);
        }
        String strMax = list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (strMax.length() < list.get(i).length()) {
                strMax = list.get(i);
            }
        }
        System.out.println(strMax);
    }
}
