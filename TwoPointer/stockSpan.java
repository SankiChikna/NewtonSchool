import java.util.Arrays;

public class stockSpan {
    public static void main(String[] args) {
        int price[] = {720, 180, 260, 310,40, 535, 695};
        int arr[] = new int[price.length];
        int max = price[price.length - 1];
        for(int i=price.length-1;i>=0;i--){
            if(price[i]>max){
                max = price[i];
            }
            arr[i] = max;
        }
        System.out.println(Arrays.toString(arr));
    }
}
