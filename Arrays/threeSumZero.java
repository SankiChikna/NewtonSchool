import java.util.ArrayList;

public class threeSumZero {
    public static void main(String[] args) {
        int arr[] = {1 ,-4 ,0 ,0 ,5 ,-5 ,1 ,0 ,-2 ,4 ,-4 ,1 ,-1 ,-4 ,3 ,4 ,-1 ,-1 ,-3};

        threeSum(arr);
    }

    static void threeSum(int[] A) {
        // Arrays.sort(A);
        // int res[][] = {{1,2,3}};
        // int ans[A.length-1][3] = new int[][];
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i<A.length-1 ; i++){
            int left = i+1;
            int right = A.length-1;
            int num = A[i];
            while(left <= right){
                if(A[left]+A[right]+num == 0){
                    list.add(num);
                    list.add(A[left]);
                    list.add(A[right]);
                    left++;
                    right--;
                }
                else if(A[left]+A[right]+num > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        System.out.println(list.toString());
        
        int len = list.size();
        int row = len/3;

        int ans[][] = new int[row][3];
        int k = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<3; j++){
                ans[i][j] = list.get(k++);
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
        // return ans;
    }
}
