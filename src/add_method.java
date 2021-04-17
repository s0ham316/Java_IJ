import java.util.Scanner;

public class add_method {
    public static int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("The sum is = "+add(a,b));
    }
}
