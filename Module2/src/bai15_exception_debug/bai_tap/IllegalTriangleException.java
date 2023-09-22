package bai15_exception_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    String error;

    public IllegalTriangleException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
