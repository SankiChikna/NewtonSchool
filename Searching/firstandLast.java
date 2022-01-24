import java.util.Arrays;
class firstandLast {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 10, 10, 10, 10, 12 };
        int res[] = {-1,-1};
        int left = 0;
        int right = arr.length - 1;
        int minIndex = -1, maxIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 10) {
                res[0] = mid;
                // maxIndex = mid;
                right = mid - 1;
            } else if (arr[mid] > 10)
                right = mid - 1;
            else
                left = mid + 1;
        }
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 10) {
                // minIndex = mid;
                res[1] = mid;
                left = mid + 1;
            } else if (arr[mid] > 10)
                right = mid - 1;
            else
                left = mid + 1;
        }
        System.out.println(Arrays.toString(res));
    }
}