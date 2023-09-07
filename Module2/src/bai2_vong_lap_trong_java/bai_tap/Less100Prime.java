package bai2_vong_lap_trong_java.bai_tap;


public class Less100Prime {
    public static void main(String[] args) {
        int n = 2;
        int count;
        while (n <= 100) {
            count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
