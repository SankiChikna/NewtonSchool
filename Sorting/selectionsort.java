package Sorting;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {8,1,3,5,2,23,7,2,1,32,3,9,5,5,2};
        System.out.println("Before : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("After : "+Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int p = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[p])
                    p = j;
            }
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = p;
        }
    }
}
