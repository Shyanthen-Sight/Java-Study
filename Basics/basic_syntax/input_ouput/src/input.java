import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        //2.import java.util.Scanner - import the Scanner class
        //3.Scanner sc = new Scanner(System.in) - create a Scanner object
        //4.sc.nextLine() - reads a line of text
        //5.sc.nextInt() - reads an integer
        //6.sc.next() - reads a string
        //7.sc.hasNext() - checks if there is another token in the input
        //7.sc.nextDouble() - reads a double
        //8.sc.nextBoolean() - reads a boolean
        //9.sc.close() - closes the Scanner object



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");
        sc.close();
    }
}
