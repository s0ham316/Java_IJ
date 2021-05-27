import java.util.Scanner;

public class prog5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=1, n, c=0, j;
        n=scanner.nextInt();
        for (;i<=n;i++){
            if (i>=2){
                c=i;
            }
            for (j=1;j<=i;j++){
                System.out.print(j);
                if (j==c){
                    while (c!=1) {
                        c--;
                        System.out.print(c);
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
