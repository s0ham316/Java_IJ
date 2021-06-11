import java.util.Scanner;

public class XProjectProg14 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=0,b=1,c=0,term=0;
        System.out.println("Enter The Number of Terms");
        term=scanner.nextInt();
        System.out.print(a+" "+b+" ");
        for (int i=3;i<=term;i++){
            c=b*2+a;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
