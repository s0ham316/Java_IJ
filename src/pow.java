import java.util.Scanner;

public class pow {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Enter the exponent");
        int exp=scanner.nextInt();
        double power=power(num, exp);
        System.out.println("Power = "+ power);
    }
    public static double power(int a, int b){
        int i=1, x=1;
        if (b<0){
            b=b*(-1);
            while (i<=b){
                x=x*a;
                i++;
            }
            return 1.0/x;
        }
        while (i<=b){
            x=x*a;
            i++;
        }
        return x;
    }
}
