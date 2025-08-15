import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The array is: "+ Arrays.toString(arr));
        int ecount = 0;
        int ocount= 0;
        for(int num:arr){
            if(num%2 == 0){
                ecount++;
            }else{
                ocount++;
            }
        }
        System.out.println("Count of Even Number: "+ecount+" & Odd Number: "+ocount);
    }
}
