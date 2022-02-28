public class quickSort {
    public static void main(String[] args) {
        int arr[] = {4,2,5,1,7,3};
        quickSort(arr,0,arr.length);
    }

    static void quickSort(int arr[],int start,int end) {
       if(start<end){
           int pi = partition(arr,start,end);
           quickSort(arr,start,pi-1);
           quickSort(arr,pi+1,end);
       }
    }

    static int partition(int[] arr,int start,int end){
        int pivot = arr[end];

        int i = start-1;

        for(int j = start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
