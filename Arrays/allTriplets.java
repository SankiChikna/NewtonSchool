import java.util.Arrays;

public class allTriplets {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 1, 4, 9 };

        int sum = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int max1 = 0, max2 = 0;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    max1 = Math.max(max1, arr[j]);
                }
            }
            for (int j = i + 1; j < arr.length; ++j)
                if (arr[j] > arr[i])
                    max2 = Math.max(max2, arr[j]);

            System.out.println(max1 + " " + max2);
            if (max1 > 0 && max2 > 0)
                sum = Math.max(sum, max1 + arr[i] + max2);
        }
    }
}
