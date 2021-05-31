public class XProjectProg7 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            double x = i+reverse(i);
            if (Math.sqrt(x)-Math.floor(Math.sqrt(x)) == 0){
                System.out.println(i);
            }
        }
    }
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