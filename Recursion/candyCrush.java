public class candyCrush {
    public static void main(String[] args) {
        long ans = crush(9);
        System.out.println(ans);
    }

    static long crush(long candies){
        long val = 0;
        if(candies == 1){
            return 1;
        }
        if(candies%3 == 1){
            val = candies / 3;
        }
        else{
            val = candies/3+1;
        }
        return (val*val)+crush(candies-val);
    }
}
