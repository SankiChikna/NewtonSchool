import java.util.Scanner;

class zeroone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();
            int W = sc.nextInt();
            int wrr[] = new int[N];
            int vrr[] = new int[N];
            for(int i=0;i<N;i++)    wrr[i] = sc.nextInt();
            for(int i=0;i<N;i++)    vrr[i] = sc.nextInt();
            
            knapsack(wrr,vrr,W,N);
        }
    }

    static int knapsack(int[] wrr,int[] vrr,int W,int N) {
        if(W == 0 || N == 0) return 0;
        int max = Integer.MIN_VALUE;
        if(wrr[N-1] <= W){
            if(max < )
        }
        else{
            return knapsack(wrr,vrr,W,N-1);
        }

    }
}