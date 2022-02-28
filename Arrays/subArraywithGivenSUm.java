public class subArraywithGivenSUm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5 };
        int start = 0;
        int sum = 5;

        int curSum = arr[0];
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            while(sum < curSum && j<i-1){
                curSum -= arr[j];
                j++;
            }
            if(curSum == sum){
                System.out.println("found at "+(i-1)+" "+j);
                System.out.println(arr[i-1]+" "+arr[j]);
            }
            curSum += arr[i];
        }
    }
}
