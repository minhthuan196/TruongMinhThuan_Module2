package bai5_access_modifier_static_method_static_property.bai_tap.b1_circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    //change access modifier:protected, default ok
    // private error
   /* private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }

    private double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }*/


}
