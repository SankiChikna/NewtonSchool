public class linklist{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;        
        }
        else{
            Node temp = head;
            for(;temp.next!=null;temp=temp.next){
                if(temp.next==null){
                    temp.next = newNode;
                    return;
                }
            }
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node addElement(Node head, int k ,int pos ) {
        //enter your code here
            Node temp = new Node(k);
            if(pos==1){
                temp.next = head;
                head = temp;;
                return head;
            }
            Node cur = head;
            Node prev = null;
            while(pos-->0){
                prev = cur;
                cur = cur.next;
            }
            temp = prev.next;
            temp.next = cur;
            return head;
    }

    public Node deleteElement(Node head,int k){
        if(head == null){
            System.out.println("Empty");
            return null;
        }
        if(head.data == k){
            Node temp = head.next;
            head = temp;
        }
        else{
            for(Node temp = head;temp.next!=null;temp.next=temp.next){
                if(temp.next.data == k){
                    Node temp1 = temp.next;
                    temp.next = temp1.next;
                }
            }
        }
        return head;
    }
    
    public static void main(String[] args) {
        linklist list = new linklist();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        // list.deleteElement(head, 1);
        list.addNode(5);

        // list.addElement(head, 2, 3);
        list.display();
    }

}
