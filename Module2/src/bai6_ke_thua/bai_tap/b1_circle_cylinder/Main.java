package bai6_ke_thua.bai_tap.b1_circle_cylinder;

public class Main {
    public static void main(String[] args) {
        //khoi tao doi tuong circle bang constructor khong tham so
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("red");
        System.out.println(circle);
        //khoi tao doi tuong circle bang constructor có tham so
        circle = new Circle(4, "yellow");
        System.out.println(circle);
        //khoi tao doi tuong cylinder bang constructor khong có tham so
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(4);
        cylinder.setRadius(6);
        cylinder.setColor("blue");
        System.out.println(cylinder);
        //khoi tao doi tuong cylinder bang constructor có 3 tham so
        cylinder = new Cylinder(4, "black", 5);
        System.out.println(cylinder);
        //khoi tao doi tuong cylinder bang constructor có 1 tham so height
        cylinder = new Cylinder(3);
        System.out.println(cylinder);
    }
}
