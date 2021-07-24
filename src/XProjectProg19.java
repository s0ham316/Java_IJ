import java.util.Scanner;

public class XProjectProg19 {
    public static void main(String[] args){
        int num=0,a=0,nums=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number");
        num=scanner.nextInt();
        int numc=num;
        for (int i=2;i<num;i++){
            if (num%i==0){
                System.out.println("Not Emirp Number");
                System.exit(0);
            }
        }
        while (numc>0){
            a=numc%10;
            nums=(nums*10)+a;
            numc/=10;
        }
        for (int i=2;i<nums;i++){
            if (nums%i==0){
                System.out.println("Not Emirp Number");
                System.exit(0);
            }
        }
        System.out.println("Emirp Number");
    }
}
