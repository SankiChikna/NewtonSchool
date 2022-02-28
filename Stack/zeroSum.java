import java.util.*;

public class zeroSum {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    void myadd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            // tail.next = newNode;
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        // tail = newNode;
    }

    void mylist(){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void findNode(){
        Node headNode = head;
        Stack<Node> stack = new Stack<Node>();

        if(head == null){
            return;
        }

        while(headNode != null){
            if(headNode.data < 0){
                int sum = headNode.data;
                while(!stack.isEmpty()){
                    Node temp = stack.pop();
                    sum -= temp.data;
                    temp = null;
                    if(sum == 0){
                        headNode = stack.peek();
                    }
                }
            }
            else{
                stack.push(headNode);
            }
            headNode = headNode.next;
        }
    }

    Node findMid(){
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
        // System.out.println(slowPtr.data);
    }
    void deleteMid(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node mid = findMid();

        Node temp = head;

        while(temp != mid){
            if(temp.next == mid){
                temp.next = mid.next;
                return;
            }
            temp = temp.next;
        }
    }

    void delDuplicates(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Set<Node> set = new HashSet<Node>();
        Node temp = head;
        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        // System.out.println(Arrays.asList(set));
        mylist();
    }

    void reverseHalf(){
        if(head == null){
            return;
        }
        Node temp = head;
        Node mid = findMid();
        Node prev = null;
        Node next = null;

        while(temp != null){
            if(temp.next == mid){
                break;
            }
        }   

        while(mid != null && mid.next == null){
            
        }
    }
    public static void main(String[] args) {
        // Node head = null;
        zeroSum list = new zeroSum();
        list.myadd(1);
        list.myadd(2);
        list.myadd(2);
        list.myadd(4);
        list.myadd(4);
        list.myadd(6);
        list.myadd(6);
        list.myadd(8);
        // list.deleteMid();
        // list.findNode();
        list.reverseHalf();
        list.mylist();
        // list.delDuplicates();
    }
}
