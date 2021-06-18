import java.util.Scanner;

public class XProjectProg6 {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        //Taking The Number as Input
        double num=scanner.nextDouble();
        System.out.println("Enter the exponent");
        //Taking The Exponent as Input
        double exp=scanner.nextDouble();
        //Calling the 'power' method to calculate the number raised to the exponent
        double power=power(num, exp);
        //Printing the result
        System.out.println("Power = "+ power);
    }
    //Method 'power' for calculation
    public static double power(double a, double b){
        double i=1, x=1;
        //This if-block executes only for negative exponents
        if (b<0){
            b=b*(-1);
            while (i<=b){
                x=x*a;
                i=i+1;
            }
            return 1.0/x;
        }
        //This If-block executes for positive exponents and 0
        while (i<=b){
            x=x*a;
            i++;
        }
        return x;
    }
}
