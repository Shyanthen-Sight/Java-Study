import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个你要查询的数：");
        int num = scanner.nextInt();
        boolean isFound = false;
        int locNum=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
                locNum=i;
                break;
            }
        }
        if (isFound) {
            System.out.println("找到了！");
            System.out.println("你要查询的数是：" + num);
            System.out.println("数组中的元素位置为：" + locNum);
        } else {
            System.out.println("没找到！");
    }
    }
}
