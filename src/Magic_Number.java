import java.util.Scanner;

public class Magic_Number {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=scanner.nextInt();
        int dig=sumofDigits(num);
        if (dig==1){
            System.out.println("Magic Number");
        }
        else {
            System.out.println("Not a Magic Number");
        }
    }
    public static int sumofDigits(int x){
        int sum=0,a;
        while (x > 0){
           a=x%10;
           sum=sum+a;
           x/=10;
            if (sum>=10 && x==0){
                x=sum;
                sum=0;
            }
        }
        return sum;
    }
}
