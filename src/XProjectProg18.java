import java.util.Scanner;

public class XProjectProg18 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization
        int num=0;
        System.out.println("Enter The Number");
        //Taking the Number as Input
        num=scanner.nextInt();
        //Increasing Number by 1
        num=num+1;
        //Generating Square Root of Increased Number
        double sqrt=Math.sqrt(num);
        //Checking for Sunny Number
        if (sqrt-(int)sqrt==0){
            //Printing "Sunny Number" if condition is met
            System.out.println("Sunny Number");
        }
        else{
            //Printing "Not Sunny Number" if condition is not satisfied
            System.out.println("Not Sunny Number");
        }
    }
}
