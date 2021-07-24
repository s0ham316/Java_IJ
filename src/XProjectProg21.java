import java.util.Scanner;

public class XProjectProg21 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int num=0;
        System.out.println("Enter The Number");
        num=scanner.nextInt();
        if (num%10==7){
            System.out.println("Buzz Number");
        }
        else if (num%7==0){
            System.out.println("Buzz Number");
        }
        else {
            System.out.println("Not a Buzz Number");
        }
    }
}
