import java.util.Scanner;

public class XProjectProg19 {
    public static void main(String[] args){
        //Initialization and Declaration of most variables
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number");
        //Taking Number as Input
        num=scanner.nextInt();
        //Declaring and initializing 'numrev' variable
        int numrev=reverse(num);
        //Checking for condition of Emirp Number
        if (isPrime(num) && isPrime(numrev)){
            //Printing "Emirp Number" if condition is matched
            System.out.println("Emirp Number");
        }
        else {
            //Printing "Not Emirp Number" if condition is not matched
            System.out.println("Not Emirp Number");
        }
    }
    //"reverse" method which returns the reverse of the number passed to it
    public static int reverse(int num){
        int rev=0,d=0;
        while(num>0){
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        return rev;
    }
    //"isPrime" method which returns boolean value true if number is prime else returns false
    public static boolean isPrime(int x){
        for (int i=2;i<x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
