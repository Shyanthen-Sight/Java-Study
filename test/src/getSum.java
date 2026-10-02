import java.util.Scanner;

public class getSum {
    public static void main(String[] args) {
        getSum obj=new getSum();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int b = scanner.nextInt();
        int sum = obj.getSum(a, b);
        System.out.println("两个整数的和为：" + sum);
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
}
