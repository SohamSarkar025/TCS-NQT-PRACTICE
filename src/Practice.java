import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //542 of sum of digit = 2+4+5 = 11
        int num = in.nextInt();
        int sum=0;
        while(num >0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("The sum of the given number is :"+sum);
    }
}
