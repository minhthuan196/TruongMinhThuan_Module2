package bai7_abstract_class_interface.bai_tap.b1_resizeable;

public class Square extends Rectangle implements IResizeable {
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
    public void resize(double percent) {
        this.setSide(this.getSide() + this.getSide() * percent);
    }
}
