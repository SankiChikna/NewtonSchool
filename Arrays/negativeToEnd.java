import java.util.*;
public class negativeToEnd {
    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-7,-5,11,6};

        int arr1[] = new int[arr.length];

        int k = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]>=0){
                arr1[k++] = arr[i];
            }
        }
        // System.out.println(Arrays.toString(arr1));
        int i=0;
        while(i<arr.length){
            if(arr[i]<0){
                arr1[k++] = arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
