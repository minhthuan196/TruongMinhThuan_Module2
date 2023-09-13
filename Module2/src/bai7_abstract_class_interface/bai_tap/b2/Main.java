package bai7_abstract_class_interface.bai_tap.b2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(3, "indigo", true);
        shapes[1] = new Rectangle(2, 3, "orange", true);
        shapes[2] = new Square(5, "yellow", true);
        shapes[3] = new Circle(4, "blue", true);
        shapes[4] = new Circle(6, "black", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
    }
}
