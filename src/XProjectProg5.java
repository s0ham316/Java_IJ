import java.util.Scanner;

public class XProjectProg5 {
    public static void main(String[] args){
        //Declaration and Initialization of Variables as per our needs
        int i=1,n,c=1,ic,co,nc;
        Scanner scanner=new Scanner(System.in);
        //Taking the number of the series
        n=scanner.nextInt();
        //To generate the spaces on the right side of the pattern this block is used
        for (;i<=n;i++){
            if (i>1){
               for (co=1;co<i;co++){
                   System.out.print(" ");
               }
            }
            //This generates the pattern with appropriate spaces
            c = getC(i, n, c);
        }
        ic=1;
        nc=n-1;
        //This generates the bottom flank of the pattern in a similar manner by reversing the conditions of top flank
        for (i=n-1;i>0;i--,nc--){
            if (ic<nc){
                for (co=1;co<i;co++){
                    System.out.print(" ");
                }
            }
            c = getC(i, n, c);
        }
    }
    //This 'getC' method generates the two flanks as per the needs with i, n and c variables supplied to it
    private static int getC(int i, int n, int c) {
        int j;
        for (j=i; j<=n; j++){
            if (c==1){
                System.out.print(j);
                c*=-1;
            }
            if (c==-1){
                System.out.print(" ");
                c*=-1;
            }
        }
        System.out.println();
        return c;
    }
}
