import java.util.Scanner;

public class XProjectProg24 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double x=0.0,n=0.0,sum=0.0;
        System.out.println("Enter the value of x");
        x=scanner.nextDouble();
        System.out.println("Enter the value of n");
        n=scanner.nextDouble();
        for (double i=0.0;i<n;i++){
            double t=i+1.0;
            sum=sum+(i*x+t)/factorial(t);
        }
        System.out.println("Sum of series = "+sum);
    }
    public static double factorial(double n){
        double i,f=1.0;
        for (i=1.0;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
