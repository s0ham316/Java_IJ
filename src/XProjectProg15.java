import java.util.Scanner;

public class XProjectProg15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double num=0,term=0;
        System.out.println("Enter The Number of Terms");
        term=scanner.nextDouble();
        do {
            System.out.println("Enter a Number");
            num=scanner.nextDouble();
            if (num%3==0){
                System.out.println("Multiple of 3");
            }
            else {
                System.out.println("Not a Multiple of 3");
            }
            term--;
        } while (term>0);
    }
}
