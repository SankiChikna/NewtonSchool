import java.util.Arrays;
public class validPalindrome {
    public static void main(String[] args) {
        int arr[] = {5,3,7,1,9,2};
        // bubblesort(arr);
        // selectionsort(arr);
        // inserstionsort(arr);
        // mergesort(arr,0,arr.length-1);
        quicksort(arr,0,arr.length-1);      
        System.out.println(Arrays.toString(arr));  
    }

    static void inserstionsort(int[] arr) {
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

    static void bubblesort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionsort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            // int val = arr[i];
            int p = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[p])
                    p = j;
            }
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = temp;
        }
    }
    static void mergesort(int arr[],int left,int right){
        if(left<right){
            int mid = left+(right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    static void merge(int arr[],int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[left+i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i] = arr[mid+i+1];
        }
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        int i =0;
        int j = 0;
        int k = left;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr[k++] = arr1[i++];
            }else{
                arr[k++] = arr2[j++];
            }
        }

        while(i<n1){
            arr[k++] = arr1[i++];
        }
        while(j<n2){
            arr[k++] = arr2[j++];
        }
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[],int left,int right){
        int pivot = arr[right];
        int i = left-1;
        for(int j=left;j<=right;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return (i+1);
    }

    static void quicksort(int arr[],int left,int right){
        if(left<right){
            int pi = partition(arr,left,right);
            quicksort(arr,left,pi-1);
            quicksort(arr,pi+1,right);
        }
    }
}
