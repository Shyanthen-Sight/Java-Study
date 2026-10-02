import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        bean1 circle = new bean1(radius);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("PI: " + circle.getPI());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}