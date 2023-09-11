package bai4_lop_va_doi_tuong_java.bai_tap.demo;

public class Watch {
    private long startTime;
    private long endTime;
    public Watch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
