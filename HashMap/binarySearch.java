import java.util.Arrays;

class binarySearch{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        search(arr,2,0,arr.length-1);
    }
    
    static void search(int[] arr,int element,int left,int right) {
        while(left<=right){
            int mid = left+(right-left)/2; // 4
            if(arr[mid] == element){
                System.out.println("Element found at "+mid);
                return;
            }
            else if(arr[mid]<element){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println("Not found");
        return;
    }
}