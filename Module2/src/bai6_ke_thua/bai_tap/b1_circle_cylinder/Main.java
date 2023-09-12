package bai6_ke_thua.bai_tap.b1_circle_cylinder;

public class Main {
    public static void main(String[] args) {
        //khoi tao doi tuong circle bang constructor khong tham so
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("red");
        //khoi tao doi tuong circle bang constructor có tham so
        Circle circle1 = new Circle(5, "red");
        System.out.println(circle);
        System.out.println(circle1);
        //khoi tao doi tuong cylinder bang constructor khong có tham so
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(4);
        cylinder.setRadius(6);
        cylinder.setColor("blue");
        //khoi tao doi tuong cylinder1 bang constructor có 3 tham so
        Cylinder cylinder1 = new Cylinder(6, "blue", 4);
        //khoi tao doi tuong cylinder2 bang constructor có 1 tham so height
        Cylinder cylinder2 = new Cylinder(4);
        System.out.println(cylinder);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
