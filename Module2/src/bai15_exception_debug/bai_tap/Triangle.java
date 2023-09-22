package bai15_exception_debug.bai_tap;

public class Triangle {
    int edgeA;
    int edgeB;
    int edgeC;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                '}';
    }
}
