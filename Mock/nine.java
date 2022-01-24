public class nine {
    class Node{
        int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head =  null,tail = null;
    
    void myadd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    void findmid(Node head){
        // System.out.println(1);
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null){
            if(fastPtr.next == null || fastPtr.next.next == null){     // 1 2 3 4 5 6
                System.out.println(slowPtr.data);
                // System.out.println(2);
                // break;
                return;
            }
            // System.out.println("slow"+slowPtr.data);
            // System.out.println("fast"+fastPtr.data);
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
    }

    void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        nine list = new nine();

        list.myadd(1);
        list.myadd(2);
        list.myadd(3);

        list.findmid(head);//2

        list.myadd(4);
        list.myadd(5);
        list.findmid(head);//2

        list.myadd(6);
        list.findmid(head);//3

        // list.print();
    }
}


// 4 7 8 10 1 2 3