package bai6_ke_thua.bai_tap.b3_point_moveablePoint;

public class Main {
    public static void main(String[] args) {
        //Test Class Point
        Point point = new Point();
        point.setX(2);
        point.setY(3);
        System.out.println(point);
        point.setXY(3, 4);
        System.out.println(point);
        float[] arrayXY = point.getXY();
        for (float v : arrayXY) {
            System.out.print(v + "\t");
        }
        //Test class MoveablePoint
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setY(2);
        moveablePoint.setX(3);
        moveablePoint.setxSpeed(4);
        moveablePoint.setySpeed(5);
        System.out.println("\n" + moveablePoint);
        System.out.println(moveablePoint.move());
        moveablePoint.setX(2);
        moveablePoint.setY(3);
        moveablePoint.setSpeed(5, 6);
        System.out.println("\n" + moveablePoint);
        System.out.println(moveablePoint.move());
        float[] arrayXSpeedYSpeed = moveablePoint.getSpeed();
        for (float v : arrayXSpeedYSpeed) {
            System.out.print(v + "\t");
        }
        moveablePoint = new MoveablePoint(2, 3);
        System.out.println("\n" + moveablePoint);

        moveablePoint = new MoveablePoint(2, 3, 4, 5);
        System.out.println(moveablePoint);

    }
}
