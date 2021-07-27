import java.util.Arrays;
import java.util.Scanner;

public class PrimeCompositeArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Number of Terms in Series");
        int n=scanner.nextInt();
        int p=0,c=0,pread=0,cread=0;
        int[] numbers=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter a Number");
            numbers[i]=scanner.nextInt();
            if (isPrime(numbers[i])){
                p=p+1;
            }
            else {
                c=c+1;
            }
        }
        int[] prime=new int[p];
        int[] composite=new int[c];
        for (int i=0;i<n;i++){
            if (isPrime(numbers[i])){
                prime[pread]=numbers[i];
                pread=pread+1;
            }
            else {
                composite[cread]=numbers[i];
                cread=cread+1;
            }
        }
        System.out.println("User Entered Array: "+Arrays.toString(numbers));
        System.out.println("Prime Array: "+Arrays.toString(prime));
        System.out.println("Composite Array: "+Arrays.toString(composite));
    }
    public static boolean isPrime(int x){
        for (int i=2;i<x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
