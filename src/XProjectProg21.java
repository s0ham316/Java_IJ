import java.util.Scanner;

public class XProjectProg21 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        //Declaring and Initializing Variable
        int num=0;
        System.out.println("Enter The Number");
        //Taking the Number as Input
        num=scanner.nextInt();
        //Checking conditions for Buzz Number
        if (num%10==7){
            //Printing 'Buzz Number' if last digit is 7
            System.out.println("Buzz Number");
        }
        else if (num%7==0){
            //Printing 'Buzz Number' if number is divisible by 7
            System.out.println("Buzz Number");
        }
        else {
            //If none of the conditions meet we print 'Not a Buzz Number'
            System.out.println("Not a Buzz Number");
        }
    }
}
