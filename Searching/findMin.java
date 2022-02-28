// given a sorted rotated array find min and no of rotations

public class findMin {
    public static void main(String[] args) {
        int arr[] = { 10, 14, 18, 20, 1, 5, 9 };
        find(arr, 0, arr.length - 1, arr.length);
    }

    static void find(int[] arr, int start, int end, int n) {
        if (start <= end) {
            int mid = start + (end - start) / n;
            int prev = (mid - 1 +n) % n;
            int next = (mid + 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                System.out.println(mid);
                return;
            } else if (arr[mid] <= arr[end])
                find(arr, start, mid - 1, n);
            else if (arr[mid] >= arr[start])
                find(arr, mid + 1, end, n);
        }
    }
}
