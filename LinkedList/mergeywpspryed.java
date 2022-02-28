public class mergeywpspryed {
    public Node head = null;
    static int length = 0;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

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
        length++;
    }

    public void display(Node head){
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

    public static void main(String[] args) {
        mergeywpspryed list = new mergeywpspryed();
        mergeywpspryed list1 = new mergeywpspryed();

        list.addNode(1);
        list1.addNode(2);
        list.addNode(3);
        list1.addNode(4);
        list.addNode(5);
        list1.addNode(6);

        mergeywpspryed list2 = new mergeywpspryed();
        list2.merge(list,list1,list2);
        list2.display(list2.head);
    }

    void merge(mergeywpspryed list,mergeywpspryed list1,mergeywpspryed list2){
        if(list.head == null){
            list2.head = list1.head;return;
        }if(list1.head ==  null){
            list2.head = list.head;return;
        }
        Node h1 = list.head;
        Node h2 = list1.head;

        Node h3;

        if(h1.data > h2.data){
            h3 = h2;
            h3.next = null;
            h2 = h2.next;
        }else{
            h3 = h1;
            h3.next = null;
            h2 = h1.next;
        }

        while(h1!= null && h2!=null){
            if(h1.data > h2.data){
                h3 = h2;
                h2 = h2.next;
            }
            else{
                h3 = h1;
                // h3.next = null;
                h2 = h1.next;
            }
            h3.next = null;
        }

        if(h1!=null){
            h3.next = h1;
            h3.next = null;
        }
        if(h2!=null){
            h3.next = h2;
            h3.next = null;
        }
    }
}
