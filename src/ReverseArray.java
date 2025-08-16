import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The array is : "+ Arrays.toString(arr));
        int i = 0;
        int j= arr.length-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println("Reverse array: "+Arrays.toString(arr));
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
