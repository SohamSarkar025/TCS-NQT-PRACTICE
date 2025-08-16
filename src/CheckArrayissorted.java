import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayissorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The array is : "+ Arrays.toString(arr));
        //1,2,3,4,5
        //1,3,4,2,5
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    sorted=false;
                    break;
                }
            }
        if(sorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
