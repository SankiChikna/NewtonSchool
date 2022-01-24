public class tenth {
    public static void main(String[] args) {
        int arr[] = {4 ,7 ,8 ,10,11 ,1 ,2 ,3}; // 10 0+6-0   1+(6-1)/2 2+(6-2)/2
        int ele = 8;
        int minIndex =  find(arr,0,arr.length);
        if(arr[0] > ele && arr[arr.length - 1]<ele){
            int left = 0;
            int right = minIndex;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(arr[mid] == ele){
                    System.out.println(true);
                    break;
                }else if(arr[mid]>ele){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            if(right)
        }
        System.out.println(minIndex);
    }

    static int find(int arr[],int left,int right) {
        while(left <= right) {
            int mid = left+(right-left)/2;
            if(arr[mid] >= arr[mid-1] && arr[mid] > arr[mid+1] ){
                return mid+1;
            }
            else if(arr[mid] >= arr[mid-1] && arr[mid] <= arr[mid+1]){
                left = left+1;
            }else{
                right = right-1;
            }
        }
        return 0;
    }
}
