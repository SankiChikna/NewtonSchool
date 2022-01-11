public class circular {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            // this.next = head;
        }
    }

    public Node head = null;

    public void myadd(int data){

        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }else{
            Node node = head;
            do{
                if(node.next==head){
                    node.next = temp;
                }
                node = node.next;
            }while(node!=head);
        }
        temp.next = head;
    }

    public void mydisp(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);

    }

    public static void main(String[] args) {
        circular list = new circular();

        list.myadd(1);
        list.myadd(2);
        list.myadd(3);
        list.myadd(4);
        list.myadd(5);

        list.mydisp();
    }
}
