import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        int num=0,quo=1,binary=0,numc=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number in Decimal");
        num=scanner.nextInt();
        numc=num;
        while (quo>0){
            quo=num/2;
            binary=(binary*10)+(num%2);
            num=num/2;
        }
        binary=reverse(binary);
        System.out.println("Binary Conversion: "+binary);
    }
    public static int reverse(int num){
        int rev=0,d=0;
        while(num>0){
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        return rev;
    }
}
