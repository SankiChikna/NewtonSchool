public class coinChange {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 

        // 1 * 17 -- 1
        // 7, 5, 5 -- 3
        // 7, 1*10 -- 11
        // 7, 5, 1*5 -- 7!/5! -- 42
        // 7, 7, 1*3 -- 5!/2!/3! -- 10
        // 5, 5, 5, 1*2 -- 5!/2!/3! -- 10
        // 5, 5, 1*7 -- 9!/7!/2! -- 36
        // 5, 1*12 -- 13!/12! -- 13

        int rupees = 4;
        
        // int ways = coinChange(arr, rupees);
        int ways = count(arr, rupees);
        System.out.println(ways);
    }
    // 10 => 
    static int count(int[] arr, int rupees){
        if(rupees == 0) return 1;
        if(rupees < 0) return 0;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += count(arr, rupees-arr[i]); // 7 
        }
        return sum;
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
