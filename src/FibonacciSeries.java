import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b =1;
        for(int i=0;i<n;i++){
            System.out.print(a+", ");
            int temp = b;
            b = a+b;
            a=temp;
        }
    }
}
