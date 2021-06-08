import java.util.Scanner;

public class XProjectProg4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Declaration and initialization of variables
        int num=0, fact=2, digSum=0, a=0, factCopy=0, factSum=0, numCopy=0;
        System.out.println("Enter a Number");
        //Taking The Number as Input
        num=scanner.nextInt();
        //Generating a Copy of the number for future use
        numCopy=num;
        //The While-Loop Block below generates the sum of all prime factors of the number excluding 1
        while (fact<=num) {
            //When the number is divisible by the factorial, this if-else block runs
            if (num%fact==0){
                //The If-Block below generates the digit sum of the prime factors if they are double digit or more
                if (fact>9){
                    digSum=0;
                    factCopy=fact;
                    while (factCopy>0){
                        a=factCopy%10;
                        digSum=digSum+a;
                        factCopy/=10;
                    }
                    factSum=factSum+digSum;
                }
                //For Single Digit Factors the else block simply adds it to the old value of the variable generating sum
                else {
                    factSum=factSum+fact;
                }
                num=num/fact;
            }
            //In case the number generated in 'fact' variable is not divisible by the number this block operates
            else if (num%fact!=0){
                fact++;
                if (fact%2==0){
                    fact++;
                }
            }
        }
        //Reusing 'digSum' variable and generating sum of digits of number
        digSum=0;
        while (numCopy>0){
            a=numCopy%10;
            digSum=digSum+a;
            numCopy/=10;
        }
        //Final Checking for Smith Number or not
        if (digSum==factSum){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not a Smith Number");
        }
    }
}
