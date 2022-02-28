import java.util.*;
public class insertAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i=0;i<arr.length;i++){
            if(i==1){
                arr[i] = 0;
            }else{
                arr[i] = scanner.nextInt();
            }
        }
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

    }
}
