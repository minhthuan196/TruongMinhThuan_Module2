package bai6_ke_thua.bai_tap.b3_point_moveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {

    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.getxSpeed(), this.getySpeed()};
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")" + ",speed=(" + this.getxSpeed() + "," + this.getySpeed() + ")";
    }

    public MoveablePoint move() {
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
        return this;
    }

}
