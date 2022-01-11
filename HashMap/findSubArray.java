import java.util.*;

class findSubArray{
    public static void main(String[] args) {
        int sum = 5;
        int arr[] = {10,15,-5,15,-10,5};
        // System.out.println(find(sum,arr));
        find(sum,arr);
    }

    static void find(int sum,int arr[]){
        int curSum = 0;
        int start = 0;
        int end = -1;

        Map <Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            curSum += arr[i];

            if(curSum-sum == 0){
                start = 0;end = i;
                break;
            }
            if(mp.containsKey(curSum-sum)){
                start = mp.get(curSum-sum) + 1;
                end = i;
                break;
            }
            mp.put(curSum,i);
        }
        // System.out.println(mp.get());
        
        if(end == -1){
            System.out.println("-1");
        }else{
            System.out.println(start+"  "+end);
        }
    }
}