import java.util.Scanner;

public class XProjectProg3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double n,flag=1.0,s=0.0;
        System.out.println("Enter The Value of x");
        double x = scanner.nextInt();
        System.out.println("Enter The Value of n");
        n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            s=s+(Math.pow(x,i)*flag);
            flag*=-1;
        }
        System.out.println("Sum of Series = "+s);
    }
}
