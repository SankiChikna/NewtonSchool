public class circularLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static Node head = null;


    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            do{
                if(temp.next==head){
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }while(temp!=head);
        }
        newNode.next = head;
    }

    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        do{
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args) {
        circularLL list = new circularLL();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
    }
}
