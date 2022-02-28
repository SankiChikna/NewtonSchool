import java.util.Scanner;

class minimumtoMakePalindrome{
    public static Node head = null;
    
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            // this.prev = null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        minimumtoMakePalindrome list = new minimumtoMakePalindrome();
        
        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            list.myadd(arr[i]);
        }

        System.out.println(list.isPalindrome(head,arr.length));
        list.mylist();
    }

    boolean isPalindromeUtil(Node right){
        Node left = head;

        if(right == null)  return true;

        System.out.print(right.data+"->");
        boolean isp = isPalindromeUtil(right.next);
        if(isp == false){
            return false;
        }

        boolean isp1 = right.data == left.data;

        left = left.next;
        return isp1;
    }

    boolean isPalindrome(Node head, int length){
        boolean res = isPalindromeUtil(head);
        return res;
    }


    void myadd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            // newNode.prev = temp;
        }
    }

    void mylist(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        for(Node temp = head;temp!=null;temp=temp.next){
            System.out.print(temp.data+"->");
        }
        System.out.print("null");
        System.out.println();
    }

}