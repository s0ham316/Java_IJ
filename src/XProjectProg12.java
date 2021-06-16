import java.util.Scanner;

public class XProjectProg12 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of 'choice' variable
        int choice=0;
        //Printing Options of Menu
        System.out.println("Enter Appropriate Choice:");
        System.out.println("Enter 1 for Celsius to Fahrenheit Temperature Conversion");
        System.out.println("Enter 2 for Celsius to Kelvin Temperature Conversion");
        System.out.println("Enter 3 for Fahrenheit to Celsius Temperature Conversion");
        System.out.println("Enter 4 for Kelvin to Celsius Temperature Conversion");
        System.out.println("Enter 0 to Exit");
        //Taking User's Choice as Input
        choice=scanner.nextInt();
        //Switch Case Block performs appropriate functions as per the case
        switch (choice){
            case 0:
                //Case 0 for Option 0 in Menu operates
                System.exit(0);
                break;
            case 1:
                //Case 1 for Option 1 in Menu operates
                System.out.println("Enter Temperature in Celsius");
                double cel=scanner.nextDouble();
                double fahr=(cel*1.8)+32;
                System.out.println("Temperature In Fahrenheit = "+fahr);
                break;
            case 2:
                //Case 2 for Option 2 in Menu operates
                System.out.println("Enter Temperature in Celsius");
                double cel2=scanner.nextDouble();
                double kel=cel2+273.15;
                System.out.println("Temperature in Kelvin = "+kel);
                break;
            case 3:
                //Case 3 for Option 3 in Menu operates
                System.out.println("Enter Temperature in Fahrenheit");
                double fahr2=scanner.nextDouble();
                double cel3=(fahr2-32)*0.56;
                System.out.println("Temperature in Celsius = "+cel3);
                break;
            case 4:
                //Case 4 for Option 4 in Menu operates
                System.out.println("Enter Temperature in Kelvin");
                double kel2=scanner.nextDouble();
                double cel4=kel2-273.15;
                System.out.println("Temperature in Celsius = "+cel4);
                break;
            default:
                //Default Case for Invalid Inputs i.e. those out of menu
                System.out.println("invalid Input!");
                System.exit(0);
        }
    }
}
