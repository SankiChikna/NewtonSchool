import java.util.*;

public class brackets {
    public static void main(String[] args) {
        String str = "{}{[]()";
        Stack <Character> stack = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if((!stack.isEmpty()) || (stack.peek()=='[' && str.charAt(i) == ']') ||(stack.peek()=='{' && str.charAt(i) == '}') ||(stack.peek()=='(' && str.charAt(i) == ')')){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }

        if(stack.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
