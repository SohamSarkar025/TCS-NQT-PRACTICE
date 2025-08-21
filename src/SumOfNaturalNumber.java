import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        int sum =0;
        //5 => 5+4+3+2+1 = 15;
        //25 =>25+24+23+..+1;
        for(int i=num;i>0;i--){
            sum+= i;
        }
        System.out.println(sum);
    }
}
