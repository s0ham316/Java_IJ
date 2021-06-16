import java.util.Scanner;

public class XProjectProg11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of 'choice' variable
        int choice=0;
        //Printing Options of Menu
        System.out.println("Enter 1 for Area of Circle");
        System.out.println("Enter 2 for Area of Square");
        System.out.println("Enter 3 for Area of Rectangle");
        System.out.println("Enter 0 to Exit");
        //Taking User's Choice as Input
        choice=scanner.nextInt();
        //For cases where user enters numbers not in Menu this block will execute
        if (choice<0||choice>3){
            System.out.println("Error: Invalid Input");
            System.exit(0);
        }
        //Switch Case Block performs appropriate functions as per the case
        switch (choice){
            case 1:
                //Case 1 for Option 1 in Menu operates
                System.out.println("Enter The Radius of Circle");
                double r=scanner.nextDouble();
                double pi=3.1416, circleArea=pi*Math.pow(r,2);
                System.out.println("Area of Circle = "+circleArea);
                break;
            case 2:
                //Case 2 for Option 2 in Menu operates
                System.out.println("Enter The Side of The Square");
                double s=scanner.nextDouble();
                double sqrArea=s*s;
                System.out.println("Area of Square = "+sqrArea);
                break;
            case 3:
                //Case 3 for Option 3 in Menu operates
                System.out.println("Enter The Length of Rectangle");
                double l=scanner.nextDouble();
                System.out.println("Enter The Breadth of Rectangle");
                double b=scanner.nextDouble();
                double recArea=l*b;
                System.out.println("Area of Rectangle = "+recArea);
                break;
            case 0:
                //Case 0 when the user wants to exit
                System.exit(0);
        }
    }
}
