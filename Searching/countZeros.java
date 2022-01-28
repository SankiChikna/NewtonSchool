class countZeros{
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int ans = count(arr,12);
        // System.out.println(count(arr,arr.length));
        System.out.println(ans);
    }

    static int count(int arr[],int n){
        if(arr[0]==0){
            return n;
        }
        int left = 0;
        int right = n;
        int minIndex = 0;
        while(left<right){
            int mid = left+(right-left)/2;
            
            if(arr[mid-1] == 1 && arr[mid] == 0){
                // mid = minIndex;r
                return n-mid;
                // minIndex = mid;
                // right = mid-1;
            }
            if(arr[mid] == 1){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return minIndex;
    }
}