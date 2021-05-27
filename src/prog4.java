import java.util.Scanner;

public class prog4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i,j,n;
        n=scanner.nextInt();
        for (i=n;i>0;i--){
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
