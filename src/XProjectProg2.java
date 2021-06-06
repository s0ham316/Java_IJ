import java.util.Scanner;

public class XProjectProg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaration of Variables and initialization of some as required.
        int row, k = 1;
        System.out.println("Enter the Number of Stars per edge of the diamond");
        //Taking the Number of Stars as Input
        row = scanner.nextInt();
        //The For-Loop Block below generates the upper flank of the diamond
        for (int i = 1; i <= row; i++) {
            //This inner For-Loop Block makes appropriate spacings before the top left stars to make a proper pattern
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            //The Left Stars of the top flank gets printed here
            System.out.print("*");
            //This If-Block and the inner for-loop block makes the inner spacings and the right stars of the top flank
            if (i >= 2) {
                for (int g = 1; g <= k; g++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                k = k + 2;
            }
            //This is just to put the control to the beginning of the next line and the loop goes on.
            System.out.println();
        }
        //The value of 'k' variable is altered as per our needs to reuse it to generate the bottom flank of diamond pattern
        k=k-4;
        for (int i2 = 2; i2 <= row; i2++) {
            //To generate spaces before the left stars of the bottom flank
            for (int j2 = 1; j2 < i2; j2++) {
                System.out.print(" ");
            }
            //Left Stars of Bottom Flank gets printed here
            System.out.print("*");
            //The spaces in between left and right stars get generated here reusing 'k' variable
            for (int kc=1;kc<=k;kc++){
                System.out.print(" ");
            }
            k=k-2;
            //To negate out an error of two consecutive stars being printed at the end of the bottom flank this if-block is used
            if (i2!=row) {
                System.out.print("*");
            }
            //Like previously this is to move the control to the beginning of the next line and the loop continues
            System.out.println();
        }
    }
}
