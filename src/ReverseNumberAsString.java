import java.util.Scanner;

public class ReverseNumberAsString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        StringBuilder number = new StringBuilder(num);
        System.out.println( number.reverse().toString());
    }
}
