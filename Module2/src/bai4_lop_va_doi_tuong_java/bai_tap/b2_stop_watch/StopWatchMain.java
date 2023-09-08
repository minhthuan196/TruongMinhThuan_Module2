package bai4_lop_va_doi_tuong_java.bai_tap.b2_stop_watch;

public class StopWatchMain {
    public static void main(String[] args) {
        int[] arrayNumber = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayNumber[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        int minArrayNumber;
        int temp;
        stopWatch.start();
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            minArrayNumber = arrayNumber[i];
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[j] < arrayNumber[minArrayNumber])
                    minArrayNumber = j;
                temp = arrayNumber[minArrayNumber];
                arrayNumber[minArrayNumber] = arrayNumber[i];
                arrayNumber[i] = temp;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
