import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int arr[] = {9,0,1,2,0,0,0,9,2,1,4};
        for(int i=0,j=1; i<arr.length-1; ) {
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;  
                j++;              
            }
            else{
            i++;
            j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//arr = {9,0,1,2,0,0,0,9,2,1,4} -> {9,1,2,9,2,1,4,0,0,0,0} 
