public class XProjectProg16 {
    //Method to check for Armstrong Number
    public static boolean isArmstrong(int n)
    {
        int d,r=0,t=n;
        while (t!=0){
            d=t%10;
            r=r+d*d*d;
            t/=10;
        }
        //Returning whether the condition is true or not
        return r == n;
    }
    public static void main(String[] args){
        int a;
        boolean f;
        for (a=100;a<=999;a++){
            //Calling isArmstrong method to check whether the number is armstrong or not
            f=isArmstrong(a);
            if (f)
                //Printing three digit armstrong numbers
                System.out.print(" "+a);
        }
    }
}
