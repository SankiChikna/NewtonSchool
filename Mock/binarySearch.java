public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {4,2,6,1,8,5,10};
        bubblesort(arr); // 1,2,4,5,6,8,10
        search(arr,0,arr.length-1,5);
    }

    static void bubblesort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void search(int[] arr,int start,int end,int element) {
        if(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == element){
                System.out.println("Found at "+mid);
                return;
            }
            else if(arr[mid] > element){
                search(arr,start,mid-1,element);
            }
            else{
                search(arr,mid+1,end,element);
            }
        }
        System.out.println("Not found");
    }
}
