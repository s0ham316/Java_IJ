import java.util.Scanner;

public class XProjectProg13 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and Initialization of Variables
        int sum=0,number=0;
        //The do-block takes number as input and adds it to old value of sum variable
        //This goes on as long as a negative number is not entered
        do {
            sum+=number;
            System.out.println("Enter a Number");
            number=scanner.nextInt();
        } while (number>=0);//The while-statement checks if the number entered is positive(or zero) or negative
        //Printing Sum of All Positive Numbers
        System.out.println("Sum of Positive Numbers = "+sum);
    }
}
