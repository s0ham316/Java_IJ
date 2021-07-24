import java.util.Scanner;

public class XProjectProg20 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0,a=0,s=0;
        System.out.println("Enter The Number");
        num=scanner.nextInt();
        int numc=num;
        while (numc>0){
            a=numc%10;
            s=s+factorial(a);
            numc/=10;
        }
        if (s==num){
            System.out.println("Krishnamurthy Number");
        }
        else {
            System.out.println("Not Krishnamurthy Number");
        }
    }
    public static int factorial(int n){
        int i,f=1;
        for (i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
