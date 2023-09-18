package bai11_DSA_Stack_Queue.bai_tap.bt2_count_map;

import java.util.TreeMap;

public class TreeMapCount {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String paragraph = "Truong Minh Thuan Truong Minh Thuan Truong Minh Thuan";
        paragraph = paragraph.toLowerCase();
        String[] arrayParagraph = paragraph.split(" ");
        int key;
        for (String s : arrayParagraph) {
            if (treeMap.containsKey(s)) {
                key = treeMap.get(s) + 1;
                treeMap.put(s, key);
            } else {
                treeMap.put(s, 1);
            }
        }
        System.out.println(treeMap);
    }


}
