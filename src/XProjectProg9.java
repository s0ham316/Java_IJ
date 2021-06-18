import java.util.Scanner;

public class XProjectProg9 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //Declaration and initializations of variables
        int i=1,j=1,n=0,nc=0;
        n=scanner.nextInt();
        //updating 'nc' variable by making it a copy of n
        nc=n;
        //This loop generates the top flank of pattern
        for(;i<=n;i++){
            for (j=1;j<=nc;j++){
                System.out.print(j);
            }
            nc=nc-1;
            System.out.println();
        }
        //This loop generates bottom flank
        for (i=2;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
