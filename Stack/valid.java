import java.util.*;

public class valid {
    public static void main(String[] args) {
        String str = "{()}[]";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        Iterator value = stack.iterator();
        while(value.hasNext()){
            System.out.print(value.next());
        }
    }

}
