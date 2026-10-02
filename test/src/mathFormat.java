import java.util.Scanner;

public class mathFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        System.out.println("Enter the value of n :");
        n=scanner.nextInt();
        System.out.println("Enter the value of k :");
        k=scanner.nextInt();
        int n_k=n-k;
        int Sumn,Sunk,Sumn_k;
        Sumn=1;
        Sunk=1;
        Sumn_k=1;
        for(int i=1;i<=n;i++){
            Sumn*=i;
        }
        for(int i=1;i<=k;i++){
            Sunk*=i;
        }
        for(int i=1;i<=n_k;i++){
            Sumn_k*=i;
        }
        int result=Sumn/(Sunk*Sumn_k);
        System.out.println("The value of nCk is :"+result);

    }
}
