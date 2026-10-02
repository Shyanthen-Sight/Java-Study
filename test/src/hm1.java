import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        System.out.println("=== Sphere Volume and Surface Area Calculator ===");
        double radius = 4.0;
        final double PI = 3.1415926;
        //get vloume of sphere
        double volume = (4.0/3.0) * PI * Math.pow(radius, 3);
        System.out.println("Volume is: " + volume);
        //get surface area of sphere
        double surfaceArea = 4.0 * PI * Math.pow(radius, 2);
        System.out.println("Surface area is: " + surfaceArea);

        System.out.println("=== leap year calculator ===");
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println('\u2713');
        } else {
            System.out.println('\u2717');
        }


        System.out.println("===F transilate to C calculator===");
        double fahrenheit;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Temperature in Celsius: " + celsius);


        //预设一个8位的二进制数值（例如：10110011），获取变量pos的值指定位数的值，pos为输入的值
        System.out.println("===octonary to binary calculator===");
        int binaryNumber = 0b10110011; // 8位二进制数值
        int pos;
        System.out.print("Enter the position (0-7) to get the bit value: ");
        pos = scanner.nextInt();
        if (pos < 0 || pos > 7) {
            System.out.println("Invalid position. Please enter a value between 0 and 7.");
        } else {
            int bitValue = (binaryNumber >> pos) & 1; // 获取指定位的值
            System.out.println("The bit value at position " + pos + " is: " + bitValue);
        }

        scanner.close();
    }
}
