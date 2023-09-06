package bai2_vong_lap_trong_java.bai_tap;


public class Less100Prime {
    public static void main(String[] args) {
        int n = 2;
        while (n <= 100) {
            boolean flag;
            flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
