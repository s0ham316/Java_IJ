import java.util.Scanner;

public class XProjectProg5 {
    public static void main(String[] args){
        //Declaration and Initialization of Variables as needed
        int i=1,n,c=1,ic,co,nc;
        Scanner scanner=new Scanner(System.in);
        //Taking the number of the pattern
        n=scanner.nextInt();
        //To generate the spaces on the left side of the pattern
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
        //Generating bottom flank of pattern
        for (i=n-1;i>0;i--,nc--){
            if (ic<nc){
                for (co=1;co<i;co++){
                    System.out.print(" ");
                }
            }
            c = getC(i, n, c);
        }
    }
    //This 'getC' method generates the two flanks with i, n, c variables given to it
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
