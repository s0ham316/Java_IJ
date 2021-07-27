import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=0,a=0,b=1,c=0;
        System.out.println("Enter The Number of Terms");
        n=scanner.nextInt();
        int[] fibonacci=new int[n];
        fibonacci[0]=a;
        fibonacci[1]=b;
        for (int i=3;i<=n;i++){
            c=a+b;
            fibonacci[i-1]=c;
            a=b;
            b=c;
        }
        System.out.println("Fibonacci Array: "+ Arrays.toString(fibonacci));
    }
}
