import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < 0){
            System.out.println("Factorial is not defined for negative number!");
            return;
        }
        int ans=1;
        for(int  i=num;i>0;i--){
            ans *= i;
        }
        System.out.println(ans);
    }
}
