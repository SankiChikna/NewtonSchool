public class subArraywithGivenSUm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5 };
        int start = 0;
        int sum = 0;

        int curSum = arr[0];
        for(int i=1;i<arr.length;i++) {
            while(curSum>sum && start<i-1){
                curSum -= arr[start];
                start++;
            }
            if(curSum == sum){
                int p =i-1;
                System.out.println("Start = "+start+"end  = "+p);
                break;
            }
            if(i<arr.length-1){
                curSum += arr[i];
            }
        }
    }
}
