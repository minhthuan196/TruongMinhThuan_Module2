package thuat_toan;

public class demo2 {
    public static int[] solution(int[] a) {
        if (a.length == 0) {
            return a;
        }
        int min;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == -1) {
                continue;
            }
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] != -1 && a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }
}
