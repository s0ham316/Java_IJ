import java.util.Scanner;

public class XProjectProg1 {
    //Method to check whether the number provided is a pronic number or not.
    public static int Pronic(int x){
        //The For-Loop Block to check whether the number provided is pronic or not.
        for (int p=0;p<=Math.sqrt(x);p++){
            if (x==p*(p+1)){
                //Returning 0 as an Indicator if number is found to be pronic
                return 0;
            }
        }
        //Returning 1 as an Indicator if number is not pronic
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        //Taking The Number of Terms as an Input
        int terms=scanner.nextInt();
        //For-Loop Block running from 1 to the number of terms and accepting numbers
        for (int i=1;i<=terms;i++){
            System.out.println("Enter a number");
            int num=scanner.nextInt();
            //Sending Number to Pronic Method and getting returned with the value of pronic or not-pronic indicator
            int d=Pronic(num);
            //Checking The Indicator returned and printing the results appropriately
            if (d==0){
                System.out.println("It is a Pronic Number");
            }
            else if (d==1){
                System.out.println("It is not a Pronic Number");
            }
        }
    }
}
