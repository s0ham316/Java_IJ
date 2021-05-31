import java.util.Scanner;

public class XProjectProg2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int row,k=1,d;
        System.out.println("Enter the Number of Rows");
        row=scanner.nextInt();
        d=row;
        for (int i=1;i<=row;i++){
            for (int j=row;j>i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if (i>=2){
                for (int g=1;g<=k;g++){
                    System.out.print(" ");
                }
                System.out.print("*");
                k=k+2;
            }
            System.out.println();
        }
        for (int i2=2;i2<=row;i2++){
            for (int j2=1;j2<i2;j2++){
                System.out.print(" ");
            }
            System.out.print("*");
            if (i2>row-1){
                System.exit(0);
            }
            for (int jk=d;jk>=1;jk--){
                System.out.print(" ");
            }
            System.out.print("*");
            d=d-2;
            System.out.println();
        }
    }
}
