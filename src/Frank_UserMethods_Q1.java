import java.util.Scanner;

public class Frank_UserMethods_Q1 {
    public static int Armstrong(int n){
        int copy=n,sum=0,d=0;
        while (copy>0){
            d=copy%10;
            sum=sum+(d*d*d);
            copy/=10;
        }
        if (sum==n){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of terms");
        int term=scanner.nextInt();
        for (int i=1;i<=term;i++){
            System.out.println("Enter a number");
            int num=scanner.nextInt();
            int f=Armstrong(num);
            if (f==1){
                System.out.println("It is an Armstrong Number");
            }
            else {
                System.out.println("It is not an Armstrong Number");
            }
        }
    }
}
