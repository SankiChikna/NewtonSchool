import java.util.*;

public class stackClass {
    public static void main(String[] args) {
        Stack <Integer>stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
