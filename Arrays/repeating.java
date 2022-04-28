import java.util.Arrays;

public class repeating {
    public static void main(String[] args) {
        int arr[] = {1,3,1,5,6,1,2,8};
        findRepeating(arr);
    }
    static void findRepeating(int[] A) {
        int brr[] = {1,3,1,5,6,1,2,8};
        for(int i=0;i<A.length;i++){
            A[A[i] % A.length] = A[A[i] % A.length] + A.length;
        }
        System.out.println(Arrays.toString(A));
        for(int i=0;i<A.length;i++){
            if(A[i] >= A.length*2){
                System.out.println(i);
                // return A[i];
                break;
            }
        }
        // return -1;
    }
}
