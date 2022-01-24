import java.util.*;

public class triplets {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        findTriplets(arr);
    }

    static void findTriplets(int arr[]) {
        Arrays.sort(arr);
        // int res[][] = {{1,2,3}};
        boolean found = false;
        for (int i = 0; i < arr.length-1; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            int x = arr[i];
            while (l < r) {
                if (arr[l] + arr[r] + x == 0) {
                    System.out.println(arr[l] + " " + arr[r] + " " + x);
                    l--;
                    r--;
                    found = true;
                } else if (arr[l] + arr[r] + x < 0) {
                    l++;
                } else {
                    r++;
                }
            }
        }
        if (!found)
            System.out.println("Not found");
    }
}
