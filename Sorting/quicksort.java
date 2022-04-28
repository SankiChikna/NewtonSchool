import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 3, 5, 2, 23, 7, 2, 1, 32, 3, 9, 5, 5, 2 };
        System.out.println("Before : " + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("After : " + Arrays.toString(arr));
    }

    static void sort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            sort(arr, start, pi - 1);
            sort(arr, pi + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
