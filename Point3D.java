public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y){
    }

    private void setXY(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] test = new float[3];
        test[0] = this.z;
        test[1] = this.z;
        test[2] = this.z;
        return test;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Point3D{");
        sb.append("z=").append(z);
        sb.append('}');
        return sb.toString();
    }
}
