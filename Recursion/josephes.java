public class josephes {
    public static void main(String[] args) {
        int n = 5;
        int ans = find(n,3);
        System.out.println(ans);
    }

    static int find(int n, int k){
        if(n == 1){
            return 1;
        }
        return (find(n-1,k)+k-1)%n+1;
    }
}
