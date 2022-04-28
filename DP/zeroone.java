import java.util.Scanner;
import java.util.Arrays;

class zeroone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int N = sc.nextInt();
        int W = sc.nextInt();
        int vrr[] = new int[N];
        int wrr[] = new int[N];
        int dp[][] = new int[N + 1][W + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < N; i++)
            wrr[i] = sc.nextInt();
        for (int i = 0; i < N; i++)
            vrr[i] = sc.nextInt();

        System.out.println(knapsack(wrr, vrr, W, N, dp));
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int knapsack(int[] wrr, int[] vrr, int W, int N, int dp[][]) {
        if (W == 0 || N == 0)
            return 0;
        if (dp[N][W] != -1)
            return dp[N][W];
        if (wrr[N - 1] <= W)
            return dp[N][W] = max(vrr[N - 1] + knapsack(wrr, vrr, W - wrr[N - 1], N - 1, dp),
                    knapsack(wrr, vrr, W, N - 1, dp));
        else
            return dp[N][W] = knapsack(wrr, vrr, W, N - 1, dp);
    }
}