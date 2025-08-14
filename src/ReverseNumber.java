import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            int rem =num % 10;
            sum = (sum*10)+rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}
