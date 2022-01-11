import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,8,9,6,7};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int start,int end) {
        if(start<end){
            int mid = start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    static void merge(int[] arr,int start,int mid,int end){
        int n1 = (mid-start)+1;
        int n2 = end-mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i] = arr[i+start];
        }

        for(int i=0;i<n2;i++){
            rightArray[i] = arr[i+mid+1];
        }

        int i=0;
        int j=0;
        int k=start;

        while(i<n1 && j<n2){
            if(leftArray[i]<rightArray[j])
                arr[k] = leftArray[i++];
            else
                arr[k] = rightArray[j++];
            k++;
        }

        while(i<n1){
            arr[k++] = leftArray[i++]; 
        }
        while(j<n2){
            arr[k++] = rightArray[j++];
        }
    }
}
