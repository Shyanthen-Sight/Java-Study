import java.util.Scanner;

public class CprTrangleSqu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个三角形的底边长度和高度：");
        double base1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();
        System.out.print("请输入第二个三角形的底边长度和高度：");
        double base2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();
        double area1 = getTriangleArea(base1, height1);
        double area2 = getTriangleArea(base2, height2);
        System.out.println("第一个三角形的面积是：" + area1);
        System.out.println("第二个三角形的面积是：" + area2);
        if (area1 > area2) {
            System.out.println("第一个三角形的面积大于第二个三角形的面积。");
        } else if (area1 < area2) {
            System.out.println("第一个三角形的面积小于第二个三角形的面积。");
        } else {
            System.out.println("两个三角形的面积相等。");
        }
    }
    public static double getTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
