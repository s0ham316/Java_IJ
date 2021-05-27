import java.util.Scanner;

public class prog9i {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=1,j=1,n=0,c=1;
        n=scanner.nextInt();
        for (;i<=n;i++){
            for (j=1;j<=n;j++){
                if (c==1){
                    System.out.print(1);
                    c*=-1;
                }
                else if (c==-1){
                    System.out.print(0);
                    c*=-1;
                }
            }
            System.out.println();
        }
    }
}
