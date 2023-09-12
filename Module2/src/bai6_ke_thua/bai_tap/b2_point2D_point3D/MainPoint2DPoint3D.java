package bai6_ke_thua.bai_tap.b2_point2D_point3D;

public class MainPoint2DPoint3D {
    public static void main(String[] args) {
        //Test with Point2D
        Point2D point2D = new Point2D();
        point2D.setX(3);
        point2D.setY(4);
        System.out.println(point2D);
        point2D.setXY(5, 6);
        System.out.println(point2D);
        float[] arrayXY = point2D.getXY();
        for (float v : arrayXY) {
            System.out.print(v + "\t");
        }
        //Test with Point3D
        Point3D point3D = new Point3D();
        point3D.setX(1);
        point3D.setY(2);
        point3D.setZ(3);
        System.out.println("\n" + point3D);
        point3D.setXYZ(2, 3, 4);
        System.out.println(point3D);
        float[] arrayXYZ = point3D.getXYZ();
        for (float v : arrayXYZ) {
            System.out.print(v + "\t");
        }
        point3D = new Point3D(3, 4, 5);
        System.out.println("\n" + point3D);

    }
}
