import java.util.Scanner;

public class XProjectProg14 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of Variables
        int a=0,b=1,c=0,term=0;
        System.out.println("Enter The Number of Terms");
        //Taking the Number of Terms as input
        term=scanner.nextInt();
        //Printing first 2 terms externally to avoid complications
        System.out.print(a+" "+b+" ");
        //The For Block Below generates the rest of the Pell Series
        for (int i=3;i<=term;i++){
            c=b*2+a;
            //Printing each term of series
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
