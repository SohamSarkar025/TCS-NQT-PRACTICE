import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
            int rem = num % 10;
            rev = (rev*10) + rem;
            num /= 10;
        }
        if(rev == temp){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
