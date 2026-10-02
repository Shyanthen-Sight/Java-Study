import java.util.Arrays;

public class methodReload {
    public static void main(String[] args) {
        System.out.println("两个数的和：" + getSum(3, 5));
        System.out.println("两个数的和：" + getSum(3, 5));
        System.out.println("两个数的和：" + getSum(3, 5));
        System.out.println("两个数的和：" + getSum(3, 5));
        System.out.println("三个数的和：" + getSum(3, 5, 7));
        System.out.println("四个数的和：" + getSum(3, 5, 7, 9));
    }
    public static double getSum(double a, double b) {
        return a + b;
    }
    public static double  getSum(double a, double b,double c) {
        return a + b + c;
    }
    public static double  getSum(double a, double b,double c,double d) {
        return a + b + c + d;
    }
}
