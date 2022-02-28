import java.util.Arrays;

class one{
    public static void main(String[] args) {
        int A[] = {-6,-1,4};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        for(int i=0;i<A.length;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if(A[i]<A[j]){
                    count++;
                }
            }
            if(count==A[i])
                return 1;
        }
        return -1;
    }
}