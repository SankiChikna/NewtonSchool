public class linklist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head=null,tail=null;


    void myadd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    void mylist(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data+"->");
        }
        System.out.println("null");
    }

    void mydel(int val){
        if(head==null){
            System.err.println("Empty");
            return;
        }
        if(head.data == val) {
            Node temp = head.next;
            head = temp;
            return;
        }
        for(Node temp = head; temp.next != null; temp = temp.next){
            if(temp.next.data == val){
                temp.next = temp.next.next;
                if(temp.next == null){
                    tail = temp.next;
                }
                System.out.println("Deleted");
                return;
            }
        }
    }

    void insertion(int val,int pos){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos && temp!= null;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = newNode;
        newNode.next = temp1;
    }

    void midNode(){
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next != null ){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        System.out.println("Middle node = "+slowPtr.data);
    }

    void reverse(){
        if(head == null){
            System.out.println("Empty node");
            return;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next  = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.myadd(1);

        list.myadd(2);

        list.myadd(3);

        // list.mylist();
        // list.mydel(2);
        list.insertion(5, 2);

        list.myadd(4);
        list.myadd(8);
        list.myadd(9);
        list.myadd(10);

        list.midNode();
        list.reverse();
        list.mylist();
    }
}
