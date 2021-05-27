import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args){
        int i,j,a,b,c,n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (i=1;i<=n;i++){
            a=1;
            b=0;
            for (j=1;j<=i;j++){
                c=a+b;
                System.out.print(c);
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
