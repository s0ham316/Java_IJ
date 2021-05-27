import java.util.Scanner;

public class prog11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i,j,n,ic;
        n=scanner.nextInt();
        for (i=0;i<=n;i++){
            ic=i;
            if (i>0){
               for (;i>0;i--){
                   System.out.print(0);
               }
            }
            i=ic;
            for (j=i;j<=i;j++){
                System.out.print(j);
            }
            for (;j<=n;j++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
