import java.util.Scanner;

public class XProjectProg3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration of Variables and initialization of some as required.
        double n,flag=1.0,s=0.0;
        System.out.println("Enter The Value of x");
        //Taking the value of 'x' as input.
        double x = scanner.nextInt();
        System.out.println("Enter The Value of n");
        //Taking the value of 'n' as input.
        n=scanner.nextInt();
        //The For-Loop Block below generates the sum of the series and adds it to s variable to generate ultimate sum
        for (int i=1;i<=n;i++){
            s=s+(Math.pow(x,i)*flag);
            flag*=-1;
        }
        //Printing the Sum of the Series
        System.out.println("Sum of Series = "+s);
    }
}
