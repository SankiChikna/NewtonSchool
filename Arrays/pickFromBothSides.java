public class pickFromBothSides {
    public static void main(String[] args) {
        int A[] = {5, -7, 9, 10, -5, 9, 10, -1, -20, 10};
        // int n = arr.length;
        int B = 6;

        int n = A.length;
        int sum = 0;
        for(int i=0; i<B; i++) sum+=A[i];
        System.out.println(sum);
        int ans = sum;
        for(int i=0; i<B; i++) {
            int temp = sum - A[B-i-1] + A[n-1-i];
            ans = Math.max(ans, temp);
            sum = temp;
        }
        System.out.println(ans);
    }
}
