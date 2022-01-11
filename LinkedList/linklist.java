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
            for(;temp!=null;temp=temp.next){
                if(temp.next==null){
                    temp.next = newNode;
                    return;
                }
            }
        }
    }

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        int k = 2;
        while(k>0){
            temp = temp.next;
            k--;
        }
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
    public static void main(String[] args) {
        linklist list = new linklist();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.addElement(head, 2, 3);
        list.display();
    }

}
