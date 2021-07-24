import java.util.Scanner;

public class XProjectProg18 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0;
        System.out.println("Enter The Number");
        num=scanner.nextInt();
        num=num+1;
        double sqrt=Math.sqrt(num);
        if (sqrt-(int)sqrt==0){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not Sunny Number");
        }
    }
}
