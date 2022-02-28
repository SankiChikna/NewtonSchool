package Sorting;
import java.util.Arrays;
public class mergesort{
    public static void main(String[] args) {
        int arr[] = {8,1,3,5,2,23,7,2,1,32,3,9,5,5,2};
        System.out.println("Before : "+Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("After : "+Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            sort(arr,start, mid);
            sort(arr,mid+1, end);
            merge(arr,start,mid,end);
        }
    }

    static void merge(int arr[],int start,int mid,int end){
        int n1 = mid-start+1;
        int n2 = end-mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<n1;i++)
            arr1[i] = arr[i+start];
        for(int j=0;j<n2;j++)
            arr2[j] = arr[j+mid+1];
        
        int i=0;
        int j=0;
        int k=start;

        while(i<n1 && j<n2){
            if(arr1[i]>arr2[j])
                arr[k] = arr1[i++];
            else
                arr[k] = arr2[j++];
            k++;
        }

        while(i<n1)
            arr[k++] = arr1[i++];
        while(j<n2)
            arr[k++] = arr2[j++];

    }
}