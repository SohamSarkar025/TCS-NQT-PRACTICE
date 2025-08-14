import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum =0;
        int temp = num;
        while(num > 0){
            int rem = num %10;
            int ans = 1;
            for(int i=rem;i>0;i--){
                ans *= i;
            }
            sum += ans;
            num /= 10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}
