import java.util.Arrays;

public class twoEqualtoThree {
    public static void main(String[] args) {
        int arr[] = {1,5,3,2};
        Arrays.sort(arr);

        int count = 0;  

        for(int i = arr.length - 1; i >= 0; i--){
            int high = arr.length - 1;
            int low = 0;

            while(high > low){
                if(arr[high]+arr[low] == arr[i]){
                    count++;
                    high--;
                    low++;
                }else if(arr[high]+arr[low] > arr[i]){
                    high--;
                }else{
                    low++;
                }
            }
        }
        System.out.println(count);
    }
}
