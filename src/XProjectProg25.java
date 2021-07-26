import java.util.Scanner;

public class XProjectProg25 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int row=0,checker=0,dead=0;
        System.out.println("Enter the Number of Rows");
        row=scanner.nextInt();
        for (int i=1;i<=row;i++){
            checker=0;
            for (int j=i;j<=row;j++){
                System.out.print(j+" ");
                checker++;
            }
            dead=1;
            while(checker<row){
                System.out.print(dead+" ");
                checker++;
                dead++;
            }
            System.out.println();
        }
    }
}
