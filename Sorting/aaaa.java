class aaaa {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        quicksort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quicksort(arr, start, pi - 1);
            quicksort(arr, pi + 1, end);
        }
    }

    static int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}