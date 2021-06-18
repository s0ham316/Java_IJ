import java.util.Scanner;

public class XProjectProg10 {
    public static void main(String[] args){
        //Declaration and Initialization of Variables of main method
        int x=0, n=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x");
        //Taking The Number as Input
        x=scanner.nextInt();
        System.out.println("Enter n");
        //Taking The Exponent as Input
        n=scanner.nextInt();
        //Calling the 'display' method to generate series
        display(x,n);
    }
    static void display(int x, int n){
        //Declaring and Initializing variables as per our needs
        double marker=1,d=0,m=0;
        for (int i=1;i<=n;i++){
            //Generating and Printing each term and their total sum
            //Calling Factorial Method to get the factorial
            m=(Math.pow(x,i)/factorial(i))*marker;
            System.out.println(m);
            d=d+m;
            marker*=-1;
        }
        //Printing Sum of Series
        System.out.println("Sum of series = "+d);
    }
    //The 'factorial' Method to get the factorial
    public static int factorial(int n){
        int i,f=1;
        for (i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
