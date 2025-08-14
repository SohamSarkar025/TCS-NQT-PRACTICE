import java.util.Scanner;

public class GCDandLCM{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcd(a,b);
        int lcm = (a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a=temp;
        }
        return a;
    }
}
