public class middleNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    void myAdd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            for(Node temp = head; temp != null; temp = temp.next){
                if(temp.next == null){
                    temp.next = newNode;
                    return;
                }
            }
        }
    }

    void midNode(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        System.out.println(slowPtr.data);
    }

    void print(){
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data+" ");
        }
    }

    public static void main(String[] args) {
        middleNode list = new middleNode();

        list.myAdd(1);
        list.myAdd(2);
        list.myAdd(3);
        list.myAdd(4);
        list.myAdd(5);
        list.myAdd(6);
        list.myAdd(7);
        list.myAdd(8);
        list.myAdd(9);

        list.midNode();
        list.print();
    }
}
