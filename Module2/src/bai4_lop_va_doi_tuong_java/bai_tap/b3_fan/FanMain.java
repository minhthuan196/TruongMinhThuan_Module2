package bai4_lop_va_doi_tuong_java.bai_tap.b3_fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan2.setOn(false);
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
