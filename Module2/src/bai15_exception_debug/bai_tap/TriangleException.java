package bai15_exception_debug.bai_tap;


import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleException triangleException = new TriangleException();
        int edgeA;
        int edgeB;
        int edgeC;
        do {
            do {
                System.out.println("Enter edge a: ");
                try {
                    edgeA = Integer.parseInt(scanner.nextLine());
                    triangleException.checkNumberPositive(edgeA);
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Exception: " + e.getMessage() + ".Enter a number!!!");
                } catch (IllegalTriangleException e) {
                    System.err.println("Exception: " + e.getError());
                }
            } while (true);
            do {
                System.out.println("Enter edge b: ");
                try {
                    edgeB = Integer.parseInt(scanner.nextLine());
                    triangleException.checkNumberPositive(edgeB);
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Exception: " + e.getMessage() + ".Enter a number!!!");
                } catch (IllegalTriangleException e) {
                    System.err.println("Exception: " + e.getError());
                }
            } while (true);
            do {
                System.out.println("Enter edge c: ");
                try {
                    edgeC = Integer.parseInt(scanner.nextLine());
                    triangleException.checkNumberPositive(edgeC);
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Exception: " + e.getMessage() + ".Enter a number!!!");
                } catch (IllegalTriangleException e) {
                    System.err.println("Exception: " + e.getError());
                }
            } while (true);

            try {
                triangleException.checkTriangle(edgeA, edgeB, edgeC);
                break;
            } catch (IllegalTriangleException e) {
                System.err.println("Exception: " + e.getError());
            }
        } while (true);
        Triangle triangle = new Triangle(edgeA, edgeB, edgeC);
        System.out.println(triangle);
    }

    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if ((a + b) > c && (a + c) > b && (b + c) > c) {
            System.out.println("These three sides can create a triangle");
        } else {
            throw new IllegalTriangleException("Three sides can't form a triangle. Enter again!!!");
        }
    }

    public void checkNumberPositive(int a) throws IllegalTriangleException {
        if (a <= 0) {
            throw new IllegalTriangleException("Number < 0. Enter again number > 0 !!!");
        }
    }
}
