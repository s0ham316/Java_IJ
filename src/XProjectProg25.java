import java.util.Scanner;

public class XProjectProg25 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of most variables
        int row=0,checker=0,dead=0;
        System.out.println("Enter the Number of Rows");
        //Taking the number of rows as input
        row=scanner.nextInt();
        //The Entire for-loop block generates the pattern
        for (int i=1;i<=row;i++){
            //Initializing checker for every outer-loop block iteration
            checker=0;
            //This nested-loop block generates the number 1 to 10 for each row from left to right
            for (int j=i;j<=row;j++){
                System.out.print(j+" ");
                checker++;
            }
            dead=1;
            //This nested-loop block does the work of restarting the series in each row from 1
            while(checker<row){
                System.out.print(dead+" ");
                checker++;
                dead++;
            }
            //This functions to move cursor to next line when a row ends
            System.out.println();
        }
    }
}
