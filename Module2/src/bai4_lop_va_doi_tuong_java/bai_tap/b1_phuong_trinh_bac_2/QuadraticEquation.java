package bai4_lop_va_doi_tuong_java.bai_tap.b1_phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(getB(), 2) - 4 * getA() * getC();
        return delta;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.sqrt(getDiscriminant())) / 2 * getA();
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.sqrt(getDiscriminant())) / 2 * getA();
        return r2;
    }

    public String showResult() {
        double delta;
        delta = getDiscriminant();
        if (delta > 0) {
            return "The equation has two roots: " + getRoot1() + " and " + getRoot2();
        } else if (delta == 0) {
            return "The equation has one roots: " + getRoot1();
        } else {
            return "The equation has no roots";
        }
    }
}
