import java.util.Scanner;

public class XProjectProg16 {
    //Method to check for Narcissistic Number
    public static boolean isNarcissistic(int n)
    {
        int d=0,r=0,t=n,c=0,g=n;
        while (g>0){
            g/=10;
            c=c+1;
        }
        while (t>0){
            d=t%10;
            r=r+(int)Math.pow(d,c);
            t/=10;
        }
        //Returning whether the condition is true or not
        return r == n;
    }
    public static void main(String[] args){
        int a=0,b=0;
        System.out.println("Enter Initial Term of Range");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("Enter Final Term of Range");
        b=scanner.nextInt();
        boolean f;
        for (;a<=b;a++){
            //Calling isNarcissistic method to check for Narcissistic Number
            f=isNarcissistic(a);
            if (f){
                //Printing each narcissistic number in the given range
                System.out.print(" " + a);
            }
        }
    }
}
