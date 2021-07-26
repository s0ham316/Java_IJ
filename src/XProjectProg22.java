import java.util.Scanner;

public class XProjectProg22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Sum of the series");
        System.out.println("2. Display series");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                int sum = 0;
                for (int i = 1; i <= 20; i++) {
                    int term = (int)Math.pow(2, i);
                    if (i % 2 == 0)
                        sum -= term;
                    else
                        sum += term;
                }
                System.out.println("Sum=" + sum);
                break;

            case 2:
                int term = 1;
                for (int i = 1; i <= 5; i++) {
                    System.out.print(term + " ");
                    term = term * 10 + 1;
                }
                break;

            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }
}
