package bai6_ke_thua.bai_tap.b1_circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    public double area() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }

    public double perimeter() {
        return 2 * this.getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: "
                + "\nColor: " + this.getColor()
                + "\nRadius: " + this.getRadius()
                + "\nArea: " + this.area()
                + "\nPerimeter: " + this.perimeter();
    }
}
