import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int arr[] = {4,2,6,7,2,9,1};
        sort(arr);
    }

    static void sort(int arr[]){ 
        for(int i=0;i<arr.length;i++){
            int p = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[p]>arr[j])
                    p = j;
            }
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
