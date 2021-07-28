import java.util.Scanner;

public class XProjectProg24 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of most variables
        double x=0.0,n=0.0,sum=0.0;
        System.out.println("Enter the value of x");
        //Taking x as input from user
        x=scanner.nextDouble();
        System.out.println("Enter the value of n");
        //Taking n as input from user
        n=scanner.nextDouble();
        for (double i=0.0;i<n;i++){
            //Generating each term of the series
            double t=i+1.0;
            //Adding the term to the 'sum' variable to print sum of series later
            sum=sum+(i*x+t)/factorial(t);
        }
        //Printing Sum of The Series
        System.out.println("Sum of series = "+sum);
    }
    //The 'factorial' method to generate factorial of each term passed to it
    public static double factorial(double n){
        double i,f=1.0;
        for (i=1.0;i<=n;i++) {
            f *= i;
        }
        //Returning factorial of number
        return f;
    }
}
