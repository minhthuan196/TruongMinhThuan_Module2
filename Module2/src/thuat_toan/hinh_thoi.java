package thuat_toan;

public class hinh_thoi {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == n || j == m) {
                    for (int k = 1; k <= 5; k++) {
                        if (i == k) {
                            System.out.print(k);
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            n--;
            m++;
            System.out.println(" ");
        }
        n = 1;
        m = 9;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 11; j++) {
                if (j == n || j == m) {
                    for (int k = 1; k <= 4; k++) {
                        if (i == k) {
                            System.out.print(k);
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }
            n++;
            m--;
            System.out.println(" ");
        }
    }
}
