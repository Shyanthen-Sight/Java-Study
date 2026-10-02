import java.util.Scanner;
public class getPostFee {
    public static void main(String[] args) {
        double weight;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("请输入包裹的重量（单位：千克）：");
            weight = scanner.nextDouble();
            //校验，合法就退出循环，不合法继续输入
            if(weightInputCheck(weight)){
                break;
            }
        }
        feeCalculate(weight);
        scanner.close();
    }

    //返回boolean，true代表合法，false不合法
    public static boolean weightInputCheck(double weight){
        if(weight < 0){
            System.out.println("输入的重量不合法，请重新输入！");
            return false;
        }
        return true;
    }

    public static void feeCalculate(double weight){
        int weightFlag=-1;
        double feeSum=0;
        if (weight<=1.0){weightFlag=0;}
        else if(weight>1.0&&weight<=6.0){weightFlag=1;}
        else if(weight>6.0){weightFlag=2;}

        switch (weightFlag) {
            case 0:
                feeSum = 10;
                System.out.println("邮费为："+feeSum+"元");
                break;
            case 1:
                feeSum = 10 + (weight - 1.0)*2.0;
                System.out.println("邮费为："+feeSum+"元");
                break;
            case 2:
                //修正公式：前6kg固定20元，超过6kg部分每kg+1.5
                feeSum = 10 + (6 - 1)*2.0 + (weight - 6.0)*1.5;
                System.out.println("邮费为："+feeSum+"元");
                break;
        }
    }
}
