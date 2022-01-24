public class linklist {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null,tail = null;

    void myadd(int val){
        Node newNode = new Node(val);
        if(head == null){
            // newNode = head;
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    void print(){
        if(head == null){
            System.out.println("Empty head");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void myins(int val,int pos){
        Node newNode = new Node(val);
        if(pos == 1){
            // Node temp = head.next;
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head.next;
        int count = 2;
        while(count!=pos){
            temp = temp.next;
            count++;
        }
        System.out.println(temp.data);
        Node newTemp = temp.next;
        newNode.next = temp;
        temp.next = newTemp;
        // temp.next = newNode;
        // newNode.next = newTemp;
    }
    public static void main(String[] args) {
        linklist list = new linklist();
        list.myadd(1);
        // list.myins(10,1);
        list.myadd(2);
        list.myadd(3);
        list.myins(20,3);
        list.myadd(4);
        list.myadd(5);
        list.myadd(6);
        list.print();
    }
}
