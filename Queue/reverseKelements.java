import java.util.LinkedList;
import java.util.Queue;

public class reverseKelements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.peek();   
        
        System.out.println(queue.peek());
    }
    /*static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
        //enter your code here
        for(int i=0;i<k;i++){
            int a = queue.peek();
            queue.set(queue.get(i),queue.get(k-i-1));
        }
        return queue;
    }*/
}
