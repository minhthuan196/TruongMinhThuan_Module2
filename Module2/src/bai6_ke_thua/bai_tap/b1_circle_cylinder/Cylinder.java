package bai6_ke_thua.bai_tap.b1_circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return this.getRadius() * this.getRadius() * Math.PI * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: "
                + "\nColor: " + this.getColor()
                + "\nRadius: " + this.getRadius()
                + "\nHeight: " + this.getHeight()
                + "\nVolume: " + this.volume();
    }
}
