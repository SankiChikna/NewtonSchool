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

    Node findmid(Node head,Node tail){
        // System.out.println(1);
        if(head == null){
            System.out.println("Empty");
            return null;
        }
        Node fastPtr = head;
        Node slowPtr = head;
        while(fastPtr != null){
            if(fastPtr.next == null || fastPtr.next.next == null){     // 1 2 3 4 5 6
                System.out.println(slowPtr.data);
                // System.out.println(2);
                break;
                // return;
            }
            // System.out.println("slow"+slowPtr.data);
            // System.out.println("fast"+fastPtr.data);
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
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

    void reverse(){
        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void binarySearch(Node head,Node tail,int value){
        while(head!=tail){
            Node mid = findmid(head,tail);    
            // System.out.println(mid.data+"->");
            if(mid.data==value){
                System.out.println("found");
                return;
            }
            else if(mid.data > value){
                // tail = mid;
                binarySearch(head,mid,value);
            }else{
                // head = mid.next;
                binarySearch(mid.next,tail,value);
            }
            // head = head.next;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        nine list = new nine();

        list.myadd(1);
        list.myadd(2);
        list.myadd(3);

        // list.findmid(head);//2

        list.myadd(4);
        list.myadd(5);
        // list.findmid(head);//2
        
        list.myadd(6);
        // list.reverse();
        
        list.print();
        list.findmid(head,tail);//3
        list.binarySearch(head,tail,3);
    }
}


// 4 7 8 10 1 2 3