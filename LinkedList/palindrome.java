public class palindrome{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static void main(String[] args) {
        palindrome list = new palindrome();
        // 1 2 3 4 3 2 1
        list.addNode(1);
        list.addNode(2);
        list.addNode(9);
        list.addNode(4);
        // list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        list.chekPalindrome(head,list);
        list.display(head);
    }

    public void chekPalindrome(Node h,palindrome list){
        list.display(head);
        Node curr = h;
        Node temp = h;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int mid = count/2;
        while(mid-->0){
            temp = temp.next;
        }
        mid = count/2;
        Node next = null;
        Node prev = temp;
        curr = h;
        while(curr != null && mid-->0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.display(prev);
        
        h = prev;
        System.out.println(h.data);
        Node newHead = h;
        System.out.println(newHead.data);
        boolean isPalindrome = true;
        if(count % 2 == 1){
            Node midNode = curr.next;
            while(newHead != curr && midNode != null){
                if(newHead.data != midNode.data){
                    // System.out.println(newHead.data);
                    // System.out.println(midNode.data);
                    isPalindrome = false;
                    break;
                }
                // System.out.println(newHead.data);
                // System.out.println(midNode.data);
                newHead = newHead.next;
                midNode = midNode.next;
            }
        }
        else{
            System.out.println("here in else");
            Node midNode = curr;
            while(newHead != curr && midNode != null){
                System.out.println("newHead=> "+newHead.data);
                System.out.println("midNode=> "+midNode.data);
                if(newHead.data != midNode.data){
                    // System.out.println(newHead.data);
                    // System.out.println(midNode.data);
                    isPalindrome = false;
                    break;
                }
                newHead = newHead.next;
                midNode = midNode.next;
            }
        }
        if(isPalindrome){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("not palindrome");
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
    }

    public void display(Node head){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node addElement(Node head, int k ,int pos ) {
        //enter your code here
            Node temp = new Node(k);
            if(pos==1){
                temp.next = head;
                head = temp;;
                return head;
            }
            Node cur = head;
            Node prev = null;
            while(pos-->0){
                prev = cur;
                cur = cur.next;
            }
            temp = prev.next;
            temp.next = cur;
            return head;
    }

    public Node deleteElement(Node head,int k){
        if(head == null){
            System.out.println("Empty");
            return null;
        }
        if(head.data == k){
            Node temp = head.next;
            head = temp;
        }
        else{
            for(Node temp = head;temp.next!=null;temp.next=temp.next){
                if(temp.next.data == k){
                    Node temp1 = temp.next;
                    temp.next = temp1.next;
                }
            }
        }
        return head;
    }

    public void reverseHalf() {
    }

}
