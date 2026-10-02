public class mathTool {
    // 静态方法：两数求和
    public static int add(int a, int b) {
        return a + b;
    }

    // 静态方法：计算圆面积
    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    // main方法测试调用
    public static void main(String[] args) {
        // ✅推荐：类名.静态方法()
        int sum = mathTool.add(3, 5);
        System.out.println("3 + 5 = " + sum);

        double area = mathTool.circleArea(2);
        System.out.println("半径为2的圆面积 = " + area);

        // ⚠语法允许，但不推荐：对象调用静态方法
        mathTool util = new mathTool();
        int sum2 = util.add(10, 20);
        System.out.println("10 + 20 = " + sum2);
    }
}
