import java.util.Scanner;

public class XProjectProg4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0, fact=2, digSum=0, a=0, factCopy=0, factSum=0, numCopy=0;
        System.out.println("Enter a Number");
        num=scanner.nextInt();
        numCopy=num;
        while (fact<=num) {
            if (num%fact==0){
                if (fact>10){
                    digSum=0;
                    factCopy=fact;
                    while (factCopy>0){
                        a=factCopy%10;
                        digSum=digSum+a;
                        factCopy/=10;
                    }
                    factSum=factSum+digSum;
                }
                else {
                    factSum=factSum+fact;
                }
                num=num/fact;
            }
            else if (num%fact!=0){
                fact++;
                if (fact%2==0){
                    fact++;
                }
            }
        }
        digSum=0;
        while (numCopy>0){
            a=numCopy%10;
            digSum=digSum+a;
            numCopy/=10;
        }
        if (digSum==factSum){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not a Smith Number");
        }
    }
}
