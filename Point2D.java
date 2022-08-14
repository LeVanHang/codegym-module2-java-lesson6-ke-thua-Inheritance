public class Point2D {
    private float x = 0.0f, y = 0.0f;

    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point2D{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public float[] getXY(){
        float[] test = new float[2];
        test[0] = this.x;
        test[1] = this.y;
        return test;
    }

}
