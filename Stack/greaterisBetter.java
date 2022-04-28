import java.util.*;

class greaterisBetter {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 }; // -2 0 6 1 3
        Stack<Integer> stack = new Stack<Integer>();
        int brr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!stack.empty()) {
                while (!stack.empty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            brr[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(brr));
    }
}