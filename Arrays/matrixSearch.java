public class matrixSearch {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
        int b = 35;
        int row = 3;
        int col = 4;
        int i = 0;
        for(;i<row;i++) {
            if(matrix[i][0] <= b && matrix[i][col-1] > b || matrix[i][0] < b && matrix[i][col-1] >= b){
                break;
            }
        }

        int left = 0, right = col-1;

        while(left <= right) {
            int mid = (left +right)/2;

            if(matrix[i][mid] == b){
                System.out.println("found");return;
            }
            else if(matrix[i][mid] > b){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
        }

        System.out.println("Not found");
    }
}
