import java.util.Scanner;

public class XProjectProg8 {
    public static void main(String[] args){
        //Declaration of variables
        int i,j,a,b,c,n;
        Scanner scanner=new Scanner(System.in);
        //Taking number of terms as Input
        n=scanner.nextInt();
        //This For-Loop Block generates the pattern
        for (i=1;i<=n;i++){
            //The initializations done here help to generate series
            a=1;
            b=0;
            //This inner loop block generates fibonacci series for each row
            for (j=1;j<=i;j++){
                c=a+b;
                System.out.print(c);
                a=b;
                b=c;
            }
            //This is just to move the cursor to the next line
            System.out.println();
        }
    }
}
