import java.util.Arrays;

public class mockChallange {
    public static Node head = null,tail = null;
    int length = 0;
    public static void main(String[] args) {
        mockChallange list = new mockChallange();
        list.myadd('m');
        list.myadd('a');
        list.myadd('d');
        list.myadd('a');
        list.myadd('m');
        // list.myadd(5);

        // list.mylist(); // 3, 4, 4, 2, 3, 5
        // int [] arr = list.listToarray();
        /*mockChallange list1 = new mockChallange();
        for(int i = 0; i < arr.length; i++) {
            list1.myadd(arr[i]);
        }
        list1.mylist();*/
        list.mylist(); // m a d a m 
        list.palindromeCheck(); 
    }

    class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    void myadd(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    void mylist(){
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
    
    void palindromeCheck(){
        if(head == null){
            System.out.println("Empty");return;
        }
        // m a d a m
        // h  
        //  t
        Node fastPtr = head;
        Node slowPtr = head;
        if(head.data != tail.data){
            System.out.println("not palindrome");
            return;
        }
        for(int i=1;i<length-1 && fastPtr.next!=null;i++){ // m a d a m
            int count = length-i-1; // 5-1-2 = 2
            while(count-->1 && slowPtr.next!=null){
                System.out.println(slowPtr.data);
                slowPtr = slowPtr.next;
            }
            if(fastPtr.next.data != slowPtr.data){
                System.out.println(fastPtr.data+"    "+slowPtr.data);
                System.out.println("Not palindrome");
                return;
                // break;
            }
            fastPtr = fastPtr.next;
        }
        System.out.println("palindrome");
    }






    int [] listToarray(){
        if(head == null){
            System.out.println("empty");
        }
        int arr[] = new int[length];
        Node temp = head;
        int i = 0;
        while(temp!=null){
            arr[i++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        return arr;
    }
}


// palindrome check