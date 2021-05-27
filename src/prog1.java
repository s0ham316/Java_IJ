import java.util.Scanner;

public class prog1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int i=1,j=1,n=0,nc=0;
        n=scanner.nextInt();
        nc=n;
        for(;i<=n;i++){
            for (j=1;j<=nc;j++){
                System.out.print(j);
            }
            nc=nc-1;
            System.out.println();
        }
        for (i=2;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
