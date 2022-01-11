package Sorting;
import java.util.Arrays;
public class insertsort {
    public static void main(String[] args) {
        int arr[] = {8,1,3,5,2,23,7,2,1,32,3,9,5,5,2};
        System.out.println("Before : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("After : "+Arrays.toString(arr));
    }

    static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int val = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j]; 
                j--;
            }
            arr[j+1] = val;
        }
    }
}
