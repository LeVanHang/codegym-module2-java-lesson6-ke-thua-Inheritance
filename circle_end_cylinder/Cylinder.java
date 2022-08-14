package circle_end_cylinder;

public class Cylinder {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVCylinder(){
        return (this.getVCylinder() * height);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
