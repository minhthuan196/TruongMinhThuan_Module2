package bai7_abstract_class_interface.bai_tap.b1_resizeable;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3, "indigo", true);
        shapes[1] = new Rectangle(2, 3, "orange", true);
        shapes[2] = new Square(5, "yellow", true);
        System.out.println("Area before resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        double numberRandom = (Math.random() * 100) + 1;
        double percent = numberRandom / 100;
        System.out.println("Area after resize");
        for (Shape shape : shapes) {
            ((IResizeable) shape).resize(percent);
            System.out.println(shape);
        }

    }
}
