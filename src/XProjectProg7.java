public class XProjectProg7 {
    public static void main(String[] args) {
        //This For-Loop Generates and prints every three digit number which when added to reverse is perfect square
        for (int i=100;i<=999;i++){
            //Generating the sum of each three digit number and reverse
            double x = i+reverse(i);
            //Checking Perfect Square and Printing
            if (Math.sqrt(x)-Math.floor(Math.sqrt(x)) == 0){
                System.out.println(i);
            }
        }
    }
    //This method finds the reverse of number
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