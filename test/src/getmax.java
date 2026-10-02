public class getmax {
    public static void main(String[] args) {
        //使用if-else语句，编写程序判断并输出变量a、b、c的最大值。
        int a = 10;
        int b = 20;
        int c = 15;
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
