import java.util.Scanner;

public class prog2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=1,j,n;
        n=scanner.nextInt();
        for (;i<=n;i++){
            for (j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
