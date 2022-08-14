public class MoveablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float[] a) {
        super(a[0], a[1]);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public Point move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] out = {this.xSpeed, this.ySpeed};
        return out;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MoveablePoint{");
        sb.append("xSpeed=").append(xSpeed);
        sb.append(", ySpeed=").append(ySpeed);
        sb.append('}');
        return sb.toString();
    }
}
