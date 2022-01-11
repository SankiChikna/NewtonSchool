import java.util.*;

class stockPrices{
    public static void main(String[] args) {    
        int arr[] = {10 ,4 ,5 ,90 ,120 ,80}; // 1 1 2 4 5 1
        int span[] = new int[arr.length];
        Stack <Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;
        for(int i = 1; i < arr.length; i++){
            while (!stack.empty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            span[i] = (stack.empty()) ? (i + 1) : (i - stack.peek());
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(span));
    }
}