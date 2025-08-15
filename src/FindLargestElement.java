import java.util.Arrays;
import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The array is: "+ Arrays.toString(arr));
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("The max element is: "+max);
    }
}
