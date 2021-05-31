import java.util.Scanner;

public class XProjectProg10 {
    public static void main(String[] args){
        int x=0, n=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x");
        x=scanner.nextInt();
        System.out.println("Enter n");
        n=scanner.nextInt();
        display(x,n);
    }
    static void display(int x, int n){
        double marker=1,d=0,m=0;
        for (int i=1;i<=n;i++){
            m=(Math.pow(x,i)/factorial(i))*marker;
            System.out.println(m);
            d=d+m;
            marker*=-1;
        }
        System.out.println("Sum of series = "+d);
    }
    public static int factorial(int n){
        int i,f=1;
        for (i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
