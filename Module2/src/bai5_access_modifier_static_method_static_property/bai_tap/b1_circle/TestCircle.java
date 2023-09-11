package bai5_access_modifier_static_method_static_property.bai_tap.b1_circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setColor("Blue");

        Circle circle1 = new Circle(3);

        System.out.println("Circle");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

        System.out.println("Circle 1");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.getArea());
    }
}
