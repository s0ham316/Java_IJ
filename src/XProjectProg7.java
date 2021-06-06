public class XProjectProg7 {
    public static void main(String[] args) {
        //This For-Loop Generates and prints every three digit number which when added with its reverse is a perfect square
        for (int i=100;i<=999;i++){
            //Generating the sum of every three digit number and its reverse and storing it in x temporarily
            double x = i+reverse(i);
            //The If-Block below is very essential because it checks the sum of the number and its reverse is a perfect square or not
            //And prints it accordingly
            if (Math.sqrt(x)-Math.floor(Math.sqrt(x)) == 0){
                System.out.println(i);
            }
        }
    }
    //The 'reverse' method generates the reverse of the provided number and returns it to 'main' method for further calculation
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