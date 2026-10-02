import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        //输入代码
        int[] scores=new int[5];
        Scanner input=new Scanner(System.in);
        int sum = 0;
        int passCount = 0;
        System.out.println("请输入5名学生的Java成绩：");
        //下面for括号里面需要填写
        for ( int i=0;i<scores.length;i++) {

            scores[i] = input.nextInt();
            if(scores[i]>100||scores[i]<0){
                System.out.println("请重新纠正输入成绩（范围：0-100）");
                i--;
            }else{
                sum += scores[i];
            }
        }
        passCount=output_grades(scores);
        output_average_qualifiedSum(sum,scores,passCount);
        input.close();
    }

    public static int output_grades(int scores[]){
        int passCount=0;
        for (int i = 0; i < scores.length; i++) {
            boolean pass = scores[i] >= 60;
            if (pass) {
                System.out.println("第" + (i + 1) + "名学生：" +scores[i] + "分，及格");

                passCount++;
            } else {
                //输入代码
                System.out.println("第"+(i+1)+"名学生："+scores[i]+"分，不及格");
            }
        }
        return passCount;
    }

    public static void output_average_qualifiedSum(int sum,int scores[],int passCount){
        //补充代码，计算平均分
        double average =(double)sum/scores.length;

        System.out.println("平均成绩：" + average);
        System.out.println("及格人数：" + passCount);
    }


}