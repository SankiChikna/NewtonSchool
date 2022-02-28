class deleteKth{
    public static Node head = null;
    static int counter = 0;
    class Node{
        int data;

        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void myadd(int data){
        counter++;
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        for(Node temp = head; temp!=null; temp=temp.next){
            if(temp.next == null){
                temp.next = newNode;
                break;
            }
        }
    }

    void mylist(Node head){
        Node temp = head;
        if(temp == null){
            System.out.println("empty");return;
        }
        for(; temp!=null; temp=temp.next){
            System.out.print(temp.data+"=>");
        }
        System.out.print("null");
    }

    void deleteKthNode(Node head,int k){
        if(head == null){
            System.out.println("empty");return;
        }
        // 4 9 2 1 10 12 13 20
        Node temp = head;
        int count = 1;
        while(count++<k){
            temp = temp.next;
        }
        System.out.println("deleted "+temp.data);
        temp.next = temp.next.next;
        counter--;
    }
    
    void deleteYthNode(Node head,int k){
        if(head == null){
            System.out.println("empty");return;
        }
        System.out.println(counter);
        int traversal = counter - k-1;
        if(traversal == 1){
            head = head.next;
        }
        Node temp = head;
        while(traversal-->0){
            temp = temp.next;
        }
        System.out.println(temp.data);
        temp.next = temp.next.next; 
        counter--;
    }
    public static void main(String[] args) {
        deleteKth list = new deleteKth();

        list.myadd(4);
        list.myadd(9);
        list.myadd(2);
        list.myadd(1);
        list.myadd(10);
        list.myadd(12);
        list.myadd(13);
        list.myadd(20);
// 4 9 2 1 10 12 13 20
        // list.deleteKthNode(head,3);
        list.deleteYthNode(head,4);
        list.mylist(head);

    }
}

// []