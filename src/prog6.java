import java.util.Scanner;

public class prog6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=1,j,n=0,ic=0,nc=0,c=0;
        n=scanner.nextInt();
        for (;i<=n;i++){
            ic=i;
            if (i>1){
                for (;i>1;i--){
                    System.out.print(" ");
                }
            }
            i=ic;
            for (j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        i=2;
        c=n-1;
        for (;i<=n;i++){
            ic=i;
            if (i<=n-1){
                for (;i<=n-1;i++){
                    System.out.print(" ");
                }
            }
            i=ic;
            for (nc=c;nc<=n;nc++){
                System.out.print(nc);
            }
            c=c-1;
            System.out.println();
        }
    }
}
