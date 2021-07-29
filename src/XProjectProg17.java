import java.util.Scanner;

public class XProjectProg17 {
    //Method to check whether the number is perfect or not
    public static boolean isPerfect(int n){
        int i=1,s=0;
        for (;i<n;i++){
            if (n%i==0)
                s=s+i;
        }
        //Returning True or False according to the result
        return s == n;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int term=0,i=1;
        System.out.println("Enter Number of Terms");
        //Taking number of terms as input
        term=scanner.nextInt();
        for (;i<=term;i++){
            System.out.println("Enter a Number");
            //Taking the number as input
            int num=scanner.nextInt();
            //Checking and Printing the result after calling isPerfect method
            if (isPerfect(num))
                System.out.println("Perfect Number");
            else
                System.out.println("Not a Perfect Number");
        }
    }
}
