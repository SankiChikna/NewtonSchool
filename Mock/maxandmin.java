public class maxandmin {
    public static void main(String[] args) {
        int arr[] = {4,1,5,9,8,10,2}; // 2

        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }
}
//  {2,5,3,6}