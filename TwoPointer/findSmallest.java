public class findSmallest {
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid] == arr[right])
                right--;
            else if(arr[mid] > arr[right])
                left++;
            else
                right = mid;
        }
        System.out.println(arr[right]);
    }
}
