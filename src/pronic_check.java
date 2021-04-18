import java.util.Scanner;

public class pronic_check {
    public static int Pronic(int x){
        for (int p=0;p<=Math.sqrt(x);p++){
            if (x==p*(p+1)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int terms=scanner.nextInt();
        for (int i=1;i<=terms;i++){
            System.out.println("Enter a number");
            int num=scanner.nextInt();
            int d=Pronic(num);
            if (d==0){
                System.out.println("It is a Pronic Number");
            }
            else if (d==1){
                System.out.println("It is not a Pronic Number");
            }
        }
    }
}
