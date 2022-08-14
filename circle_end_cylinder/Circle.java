package circle_end_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public double getS() {
        return radius * radius * Math.PI;
   }

   public double getP() {
        return 2 * radius * Math.PI;
   }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
