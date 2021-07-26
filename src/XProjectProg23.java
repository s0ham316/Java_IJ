import java.util.Scanner;

public class XProjectProg23 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=0,sum=0;
        System.out.println("Enter the Number of Terms");
        n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int term=1+((i*(i+1))/2);
            sum=sum+term;
            System.out.print(term+" ");
        }
        System.out.println("Sum of Series = "+sum);
    }
}
