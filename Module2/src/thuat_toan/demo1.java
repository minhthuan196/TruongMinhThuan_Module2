package thuat_toan;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> number1 = new HashSet<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);
    }
}
