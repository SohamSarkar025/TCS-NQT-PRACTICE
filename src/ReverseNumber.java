import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            //num=153
            int rem =num % 10;//3,5,1
            sum = (sum*10)+rem; // 3,35,351
            num /= 10;//15,1,0
        }
        System.out.println(sum);
    }
}
