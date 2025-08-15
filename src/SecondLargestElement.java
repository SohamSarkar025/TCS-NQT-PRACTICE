import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The array is: "+ Arrays.toString(arr));
        int slarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for(int num:arr){
            if(num > large){
                slarge = large;
                large=num;
            }
            else if(num > slarge && num!= large){
                slarge = num;
            }
        }
        if(slarge == Integer.MIN_VALUE){
            System.out.println("Cannot determined");
        }else{
            System.out.println("Second Largest Element is : "+slarge);
        }
    }
}
