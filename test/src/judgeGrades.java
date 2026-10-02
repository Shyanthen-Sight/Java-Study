import java.util.Scanner;

public class judgeGrades {
    public static void main(String[] args) {
        double[] grades = new double[5];
        double[] grades2 = new double[3];
        inputGrade(grades);
        removeMaxMIN(grades, grades2);
        average(grades2);
    }
    public static void inputGrade(double[] grades) {
        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<=5;i++){
            System.out.print("请输入第" + i + "个评委评价成绩：");
            double score = scanner.nextDouble();
            if (score <= 100 && score >= 0) {
                grades[i-1] = score;
            } else {
                System.out.println("输入的成绩不合法，请重新输入！");
                i--;
            }
        }
    }
    public static void removeMaxMIN(double[] grades, double[] grades2) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (grades[i] > grades[j]) {
                    double temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        for (int i = 1; i < 4; i++) {
            grades2[i - 1] = grades[i];
        }
    }
    public static void average(double[] grades2) {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grades2[i];
        }
        double average = sum / 3;
        System.out.println("最终选手成绩为：" + average);
    }

}
