import java.util.Scanner;

public class prog3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i,j,n;
        n=scanner.nextInt();
        int nc=n;
        for (i=n;i>0;i--){
            for (j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
