import java.util.Scanner;

public class XProjectProg22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Printing available choices of menu
        System.out.println("1. Sum of the series");
        System.out.println("2. Display series");
        System.out.print("Enter your choice: ");
        //Taking choice of user
        int choice = scanner.nextInt();

        switch (choice) {
            //First Case to Generate and Print the Sum of the First Series
            case 1:
                int sum = 0;
                System.out.println("Enter The value of x");
                int x=scanner.nextInt();
                System.out.println("Enter the value of the exponent");
                int expo=scanner.nextInt();
                for (int i = 1; i <= expo; i++) {
                    int term = (int)Math.pow(x, i);
                    //This if-block generates each term and adds it to 'sum' variable to generate sum of series
                    if (i % 2 == 0)
                        sum -= term;
                    else
                        sum += term;
                }
                //Printing Sum of the Series
                System.out.println("Sum=" + sum);
                break;
            //Second Case to generate and display the second series
            case 2:
                int flag = 1;
                System.out.println("Enter the Number of terms");
                int term=scanner.nextInt();
                for (int i = 1; i <= term; i++) {
                    //Each Term is Printed here
                    System.out.print(flag + " ");
                    flag = flag * 10 + 1;
                }
                break;
            //Default Case in case the user enters something other than the choices offered in the menu
            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }
}
