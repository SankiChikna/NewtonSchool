import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int sum = -2;
        Arrays.sort(arr);
        // -3,-1,0,1,1
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                System.out.println("found");
                break;
            } else if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
    }
}
