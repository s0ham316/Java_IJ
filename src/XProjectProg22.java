import java.util.Scanner;

public class XProjectProg22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration and Initialization of Variables
        long flag = 1;
        System.out.println("Enter the Number of terms");
        //Taking Number of Terms as Input
        long n=scanner.nextLong();
        //This loop block prints each term of series
        for (long i = 1; i <= n; i++) {
            //Each Term is Printed here
            System.out.print(flag + " ");
            //The term gets updated for every iteration here
            flag = flag * 10 + 1;
        }
    }
}
