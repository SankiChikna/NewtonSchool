import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {3,1,5,1,6,2,7,9};
        Arrays.sort(arr);
        System.out.println(find(arr,9,0,arr.length-1));
    }

    static boolean find(int arr[],int num,int l,int h){
        if(h>=l){
            int m = (l+h)/2;
            if(num == arr[m]){
                return true;
            }
            if(num>arr[m]){
                return find(arr,num,m+1,h);
            }
            return find(arr,num,l,m-1);
        }
        return false;
    }
}
