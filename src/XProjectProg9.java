import java.util.Scanner;

public class XProjectProg9 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //Declaration and initializations of variables
        int i=1,j=1,n=0,nc=0;
        n=scanner.nextInt();
        //updating 'nc' variable by making it a copy of n, which is number of rows, for further use
        nc=n;
        //This loop generates the top flank of the pattern using the copy of 'n' variable i.e. 'nc'
        for(;i<=n;i++){
            for (j=1;j<=nc;j++){
                System.out.print(j);
            }
            nc=nc-1;
            System.out.println();
        }
        //This loop generates the bottom flank of the pattern using 'n' variable
        for (i=2;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
