public class hm2 {
    public static void main(String[] args) {
        //编写程序，按5℃的增量，输出一个从摄氏温度到华氏温度的转换表（0℃~100℃）。
        for (int c = 0; c <= 100; c += 5) {
            double f = c * 9.0 / 5.0 + 32.0;
            System.out.println(c + "℃ = " + f + "℉");
        }
    }
}
