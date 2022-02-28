public class hello {
    public static void main(String[] args) {
        int arr[]= {1,1,1,0,0}; // {1,1,1,0,0,0};

        countZeros(arr,0,arr.length-1);
    }

    static void countZeros(int[] arr,int left,int right){
        while(left <= right){
            int mid = left+(right-left)/2;
            int prev = (mid-1)%arr.length;
            int next = (mid+1)%arr.length;
            if(arr[mid] == 0 && arr[prev] == 1 && arr[next] == 0){
                System.out.println(arr.length-mid);
                break;
            }
            else if(arr[mid] == 1){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
    }
}
