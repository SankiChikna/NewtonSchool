public class findMax {
    public static void main(String[] args) {
        int arr[] = {34 ,45 ,56 ,67 ,78 ,89 ,98 ,12 ,23};

        find(arr,0,arr.length-1);
    }

    static void find(int arr[],int left,int end){
        int n = arr.length;
        while(left<= end){
            int mid = left+(end-left)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;

            if(arr[next]<= arr[mid] && arr[prev] <= arr[next]){
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[end] < arr[mid]){
                // left = mid+1;
                end = mid-1;
            }
            else if(arr[left] > arr[mid] ){
                left = mid+1;
            }
        }
    }
}
// 34 45 56 67 78 89 98 12 23