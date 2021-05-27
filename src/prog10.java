import java.util.Scanner;

public class prog10 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=1,j=1,n=0,d=0,c=0,ic=0;
        n=scanner.nextInt();
        for (;i<=n;i++){
            ic=i;
            d=n-1;
            for (c=0, j=1; j<=i; j++,d=d-1){
                System.out.print(ic+" ");
                ic=ic+d;
            }
            System.out.println();
        }
    }
}
