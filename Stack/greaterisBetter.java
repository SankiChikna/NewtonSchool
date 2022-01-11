import java.util.*;

class greaterisBetter{
    public static void main(String[] args) {
        int arr[] = {6,4,6,8,2}; // -2 0 6 1 3 
        Stack<Integer>stack = new Stack<Integer>();
        int brr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j = i;
            int count1 = 0;
            int count2 = 0;   
            while(j<arr.length){
                stack.push(arr[j]);
                if(stack.peek()>arr[i]){
                    count1 = j+1;
                    break;
                }
                j++;
                stack.pop();
            }
            stack.clear();
            j = i;
            while(j>=0){
                // System.out.println("j : "+j);
                stack.push(arr[j]);
                // System.out.println("peek : "+stack.peek());
                if(stack.peek()>arr[i]){
                    count2 = j+1;
                    break;
                }
                j--;
                stack.pop();
            }
            if(count1==0){
                count1=-1;
            }
            if(count2==0){
                count2=-1;
            }
            if(count1 == -1 && count2 == -1){
                brr[i] = -2;
            }
            else{
                brr[i] = count2+count1;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}