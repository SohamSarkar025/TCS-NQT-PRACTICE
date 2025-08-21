import java.util.Scanner;

public class SumOfDigitUntillSingleDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //154 => 10 => 1
        while(num >= 10){
            int sum = 0;
            while(num>0){
                int rem = num %10;//4,5,1 //0,1
                sum += rem;//4+5+1=10 //0+1=1
                num /= 10;//15,1,0 //1,0
            }
            num = sum;//10 //1
        }
        System.out.println(num);
    }
}
