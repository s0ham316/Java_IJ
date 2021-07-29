import java.util.Scanner;

public class XProjectProg23 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of variables
        int n=0,sum=0;
        System.out.println("Enter the Number of Terms");
        //Taking the Number of Terms as Input
        n=scanner.nextInt();
        for (int i=0;i<n;i++){
            //Generating each term of series
            int term=1+((i*(i+1))/2);
            //Adding term to generate sum of series to be printed later
            sum=sum+term;
            //Printing each term of series
            System.out.print(term+" ");
        }
        System.out.println();
        //Printing sum of entire series
        System.out.println("Sum of Series = "+sum);
    }
}
