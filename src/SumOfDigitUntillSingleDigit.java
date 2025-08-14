import java.util.Scanner;

public class SumOfDigitUntillSingleDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num >= 10){
            int sum = 0;
            while(num>0){
                int rem = num %10;
                sum += rem;
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}
