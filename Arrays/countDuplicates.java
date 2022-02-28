import java.util.Scanner;
import java.util.*;

public class countDuplicates {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = 5;
        int arr[] = {1,1,2,2,3};
        int count[] = new int[arr.length];
        Arrays.fill(count, 1);
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length-1;
            int counter = 1;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(arr[mid] == arr[i]){
                    counter++;
                    left = mid+1;
                }
                else if(arr[mid]>arr[i]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            arr[i] = counter;
        }
        System.out.println(Arrays.toString(count));
    }
}
