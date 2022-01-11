public class usingObject {
    class Node{
        int data;
        Node next;
        public Node(int val) {
            data = val;
            next = null;
        }
    }

    Node top = null;
    Node head = null;
    int count=0;

    public void myadd(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return;
        }
        top = newNode;
    }

    public void pop(){
        if(top == null){
            return;
        }
        Node cur = top;
        while(cur.next.next != null){
            cur = cur.next;
        }
        System.out.println("Removed : "+cur.data);
        top = cur;
        // cur.next = null;
    }

    public void top(){
        System.out.println(top.data);
    }

    public static void main(String[] args) {
        usingObject ob = new usingObject();
        ob.myadd(12);  
        ob.myadd(11);    
        ob.top();
        ob.myadd(13); 
        ob.pop();   
        ob.myadd(14);    
        ob.top();
    }
}
