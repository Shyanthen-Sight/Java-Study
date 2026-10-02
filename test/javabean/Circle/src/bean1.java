public class bean1 {
    private double radius;
    private final double PI = 3.14;

    public bean1(double radius) {
        this.radius = radius;
    }
    public bean1() {
        System.out.println("Default constructor called. Please set the radius using setRadius() method.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }
}
