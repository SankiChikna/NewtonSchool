public class linklistDemo{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }

    public Node head=null,tail=null;

    public void myadd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            head.prev = null;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail=newNode;
        tail.next = null;
    }

    public void myList(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        System.out.println(head.next.next.prev.data);
        for(Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data+"  ");
    }

    public static void main(String[] args) {
        linklistDemo list = new linklistDemo();
        list.myadd(1);
        list.myadd(2);
        list.myadd(3);
        list.myadd(4);
        list.myadd(5);

        list.myList();
    }
}