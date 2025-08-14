import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        boolean ans = isArmStrong(num);
        if(ans){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
    public static boolean isArmStrong(int num){
        int temp = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while(num > 0){
            int rem = num % 10;
            sum += (int) Math.pow(rem, digit);
            num /= 10;
        }
        return sum == temp;
    }
}
