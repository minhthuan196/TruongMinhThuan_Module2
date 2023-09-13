package bai7_abstract_class_interface.bai_tap.b2;


public class Square extends Rectangle implements IColorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return getWidth() * 4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + " Area: "
                + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
