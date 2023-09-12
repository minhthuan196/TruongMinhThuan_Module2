package bai5_access_modifier_static_method_static_property.bai_tap.b1_circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Circle");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

    }
}
