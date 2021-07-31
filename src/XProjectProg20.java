import java.util.Scanner;

public class XProjectProg20 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of most variables
        int num=0,a=0,s=0;
        System.out.println("Enter The Number");
        //Taking Number as Input
        num=scanner.nextInt();
        //Creating and Initializing 'numc' variable
        int numc=num;
        //This loop generates the sum of the factorial of each digit
        while (numc>0){
            a=numc%10;
            //Using 'factorial' method to get the factorial of each digit and add it to 's'
            s=s+factorial(a);
            numc/=10;
        }
        //Checking for the Conditions of Krishnamurthy Number
        if (s==num){
            //Printing 'Krishnamurthy Number' when comndition is met
            System.out.println("Krishnamurthy Number");
        }
        else {
            //Printing 'Not Krishnamurthy Number' if condition is not satisfied
            System.out.println("Not Krishnamurthy Number");
        }
    }
    //Factorial Method which returns the factorial of number
    public static int factorial(int n){
        int i,f=1;
        for (i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
