public class Output8 {
    public static void main(String[] args){
        int a = 24;
        int b = 11;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +c + d--;
        int f = -a + b--+ -c -d++;
        int sum = a + b + c + d + e + f;
        System.out.println("Sum = " + sum);
    }
}
