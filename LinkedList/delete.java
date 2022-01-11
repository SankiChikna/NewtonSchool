public class delete {
    
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void myadd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            for(Node temp = head; temp != null; temp = temp.next){
                if(temp.next == null){
                    temp.next = newNode;
                    return;
                }
            }
        }
    }

    public void mydel(){
        if(head == null){
            System.out.println("Empty");return;
        }
        //System.out.println("ENter a no to delete : ");
        int x = 12;
        Node temp;
        if(head.data == x){
            temp = head.next;
            head = temp;
            return;
        }else{
            Node cur = head;
            // Node prev = null;
            for(;cur.next!=null; cur = cur.next){
                if(cur.next.data == x){
                    // Node prev = cur;
                    cur.next = cur.next.next;return;
                }
            }
        }
    }

    public void mydisp(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        delete list = new delete();

        list.mydel();
        list.myadd(12);
        list.myadd(11);
        list.myadd(10);
        list.myadd(9);
        list.mydisp();
        list.mydel();
        System.out.println("After deletion");
        list.mydisp();
    }
}
