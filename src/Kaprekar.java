import java.util.Scanner;

public class Kaprekar {
    int start, end;
    void accept(){
        Scanner scanner=new Scanner(System.in);
        start=scanner.nextInt();
        end=scanner.nextInt();
    }
    int countdigit(int num){
        int c=0;
        while (num>0){
            c++;
            num/=10;
        }
        return c;
    }
    boolean isKaprekar(int num){
        int c=countdigit(num);
        int sq=num*num;
        int a=sq/(int) Math.pow(10,c);
        int b=sq%(int) Math.pow(10,c);
        return (a+b==num);
    }
    void displaySeries(){
        for (int i=start;i<=end;i++)
            if (isKaprekar(i))
                System.out.print(i+" ");
    }
    void main(){
        Kaprekar obj=new Kaprekar();
        obj.accept();
        obj.displaySeries();
    }
}

