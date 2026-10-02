import java.util.Scanner;

public class classGrades {
    public static void main(String[] args) {
        double[] grades = new double[10];
        inputGrades(grades);
        getQualifiedRate(grades);
        getTopGrades(grades);
    }
    public static void inputGrades(double[] grades) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            System.out.print("请输入第" + (i+1) + "个学生的成绩：");
            double score = scanner.nextDouble();
            if (score >= 0 && score <= 100) {
                grades[i] = score;
            } else {
                System.out.println("输入的成绩不合法，请重新输入！");
                i--;
            }
        }
        scanner.close();
    }
    public static void getQualifiedRate(double[] grades) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (grades[i] >= 60) {
                count++;
            }
        }
        double qualifiedRate = (double) count / 10 * 100;
        System.out.println("及格率为：" + qualifiedRate + "%");

    }
    public static void getTopGrades(double[] grades) {
        double max = grades[0];
        for (int i = 1; i < 10; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        System.out.println("最高分为：" + max);
    }
}
