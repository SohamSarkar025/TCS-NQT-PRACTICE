import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         if(num<=1){
             System.out.println("Not Prime");
         }
         else{
             boolean isPrime = true;
             int limit = (int) Math.sqrt(num);
             for(int i=2;i<=limit;i++){
                 if(num % i==0){
                    isPrime = false;
                     break;
                 }
             }
             if(isPrime){
                 System.out.println("Prime");
             }
             else{
                 System.out.println("Not Prime");
             }
        }
    }
}
