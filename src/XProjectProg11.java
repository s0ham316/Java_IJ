import java.util.Scanner;

public class XProjectProg11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        System.out.println("Enter 1 for Area of Circle");
        System.out.println("Enter 2 for Area of Square");
        System.out.println("Enter 3 for Area of Rectangle");
        System.out.println("Enter 0 to Exit");
        choice=scanner.nextInt();
        if (choice<0||choice>3){
            System.out.println("Error: Invalid Input");
            System.exit(0);
        }
        switch (choice){
            case 1:
                System.out.println("Enter The Radius of Circle");
                double r=scanner.nextDouble();
                double pi=3.1416, circleArea=pi*Math.pow(r,2);
                System.out.println("Area of Circle = "+circleArea);
                break;
            case 2:
                System.out.println("Enter The Side of The Square");
                double s=scanner.nextDouble();
                double sqrArea=s*s;
                System.out.println("Area of Square = "+sqrArea);
                break;
            case 3:
                System.out.println("Enter The Length of Rectangle");
                double l=scanner.nextDouble();
                System.out.println("Enter The Breadth of Rectangle");
                double b=scanner.nextDouble();
                double recArea=l*b;
                System.out.println("Area of Rectangle = "+recArea);
                break;
            case 0:System.exit(0);
        }
    }
}
