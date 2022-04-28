import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 3, 5, 2, 23, 7, 2, 1, 32, 3, 9, 5, 5, 2 };
        System.out.println("Before : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
