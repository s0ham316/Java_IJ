import java.util.Scanner;

public class XProjectProg22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration and Initialization of Variables
        int flag = 1;
        System.out.println("Enter the Number of terms");
        //Taking Number of Terms as Input
        int term=scanner.nextInt();
        //This loop block prints each term of series
        for (int i = 1; i <= term; i++) {
            //Each Term is Printed here
            System.out.print(flag + " ");
            //The term gets updated for every iteration here
            flag = flag * 10 + 1;
        }
    }
}
