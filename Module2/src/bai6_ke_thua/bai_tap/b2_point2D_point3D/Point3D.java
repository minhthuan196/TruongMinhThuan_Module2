package bai6_ke_thua.bai_tap.b2_point2D_point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + this.getZ() + ")";
    }
}
