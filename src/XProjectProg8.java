import java.util.Scanner;

public class XProjectProg8 {
    public static void main(String[] args){
        //Declaration of variables
        int i,j,a,b,c,n;
        Scanner scanner=new Scanner(System.in);
        //Taking terms of fibonacci series as input
        n=scanner.nextInt();
        //This For-Loop Block generates the triangular pattern of the fibonacci series
        for (i=1;i<=n;i++){
            //The initializations done here help to generate the fibonacci series for every row
            a=1;
            b=0;
            //This inner loop block generates fibonacci series of each row
            for (j=1;j<=i;j++){
                c=a+b;
                System.out.print(c);
                a=b;
                b=c;
            }
            //This is just to move the cursor to the beginning of a new line to form a pattern
            System.out.println();
        }
    }
}
