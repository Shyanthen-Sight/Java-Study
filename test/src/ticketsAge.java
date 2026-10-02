import java.util.Scanner;
public class ticketsAge {


    public static void main(String[] args) {
         class AgeJudge {
            int age;

            public AgeJudge(int age) {
                this.age = age;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void judgeAge(int age) {
                if (age < 0) {
                    System.out.println("年龄不能为负数");
                } else if (age < 18) {
                    System.out.println("未成年人");
                    System.out.println("未成年人票价为：10元");
                } else if (age < 60) {
                    System.out.println("成年人");
                    System.out.println("成年人票价为：20元");
                } else {
                    System.out.println("老年人");
                    System.out.println("老年人票价为：15元");
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        AgeJudge judge = new AgeJudge(age);
        judge.judgeAge(age);
    }
}
