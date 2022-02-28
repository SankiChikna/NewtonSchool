import java.util.Scanner;

public class linklistt {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            for(Node temp = head; temp != null; temp = temp.next){
                if(temp.next == null){
                    temp.next = newNode;
                    break;
                }
            }
        }
    }

    void mylist(Node head){
        if(head == null){
            System.out.println("Empty"); return;
        }
        for(Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data+"=>");
        }
        System.out.print("null");
    }


    void mergeList(linklistt arr[]){
        int k = arr.length;
        for(int i=0;i<k-1;i++){
            Node curr = arr[i].head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = arr[i+1].head;
        }
    }
    public static void main(String[] args) {
        linklistt list = new linklistt();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
    
        // list.mylist();
        Scanner sc = new Scanner(System.in);
        linklistt arr[] = new linklistt[3];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                System.out.println("Enter size  ");
                int s = 5;
                arr[i] = new linklistt();
                for(int j=0;j<s;j++){
                    arr[i].add(s--);
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            // arr[i].mylist();
            System.out.println();
        }

        list.mergeList(arr);
        // arr[0].mylist();
        Node newHead = arr[0].reverseKalter(arr[0].head, 3);
        arr[0].mylist(newHead);
    }

    Node reverseKalter(Node node,int k){
        // System.out.println(node.data);

        Node curr = node;
        Node prev = null;
        Node next = null;
        int i = 0;
        while(curr != null && i++<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(curr != null){
            node.next = curr;
        }
        i = 0;
        while(i++<k && curr != null){
            curr = curr.next;
        }

        if(curr!= null){
            curr.next = reverseKalter(curr,k);
        }
        return prev;
    }
}
