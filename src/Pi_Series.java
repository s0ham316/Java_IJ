import java.util.Scanner;
public class Pi_Series {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int term=0;
        double val=0.0;
        System.out.println("Enter the terms of series");
        term=scanner.nextInt();
        val=pi(term);
        if (val<Math.PI){
            System.out.println("Series Ends with Negative Term");
            System.out.println("Sum of Series = "+val);
            System.out.println("Sum is less than value of Pi by "+(Math.PI-val));
        }
        else if (val>Math.PI){
            System.out.println("Series Ends with Positive Term");
            System.out.println("Sum of Series = "+val);
            System.out.println("Sum is greater than value of Pi by "+(val-Math.PI));
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public static double pi(int n) {
        double s=0, flag=1, term1=0;
        for (double i = 1.0; i <= n; i = i + 2.0) {
            term1=(4.0/i)*flag;
            s=s+term1;
            flag*=-1.0;
        }
        return s;
    }
}
