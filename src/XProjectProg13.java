import java.util.Scanner;

public class XProjectProg13 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int sum=0,number=0;
        do {
            sum+=number;
            System.out.println("Enter a Number");
            number=scanner.nextInt();
        } while (number>=0);
        System.out.println("Sum of Positive Numbers = "+sum);
    }
}
