import java.util.Scanner;

public class mergeKlinklist {
    
    public Node head = null;

    class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 3;
        mergeKlinklist arr[]= new mergeKlinklist[k];
        for(int i=0;i<k;i++){
            if(arr[i]==null){
                System.out.println("Enter size  ");
                int s = sc.nextInt();
                arr[i] = new mergeKlinklist();
                for(int j=0;j<s;j++){
                    arr[i].myadd(sc.nextInt());
                }
            }
        }
        for(int i=0;i<k;i++){
            arr[i].mylist();
            System.out.println();
        }
        concatLinkedList(arr);
        arr[0].mylist();
    }  
    static void concatLinkedList(mergeKlinklist[] abc){
        int k = abc.length;
        int i=0;
        Node cur;
        Node result = abc[0].head;
        while(k-->1){
            cur = abc[i++].head;
            while(cur.next!= null){
                cur = cur.next;
            }
            cur.next = abc[i].head;
        }
        // return result;    
    }
    // static void merge(Node head1,Node head2){
    //     Node temp = head1;
    //     while(temp != null){
    //         if(temp.next == null){
    //             temp.next = head2;
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     temp = head1;
    //     while(temp != null){
    //         System.out.println(temp.data);
    //         temp = temp.next;
    //     }
    // }

    public void myadd(int data){
        // System.out.println(1);
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            for(Node temp = head;temp!=null;temp = temp.next){
                if(temp.next == null){
                    temp.next = newNode;
                    break;
                }
            }
        }
    }

    void mylist(){
        if(head == null){
            System.out.println("Empty");return;
        }
        for(Node temp = head;temp!=null;temp = temp.next){
            System.out.print(temp.data+"->");
        }
        System.out.print("null");
    }
}

// {1,2,3} {4,5,6}
