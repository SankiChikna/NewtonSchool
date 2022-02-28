class arrayToList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head=null, tail=null;


    void myadd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    void mydel(int data){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.data == data){
            head = head.next;
            System.out.println("Deleted");
            return;
        }
        Node temp = head;
        for(;temp.next != null; temp = temp.next){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                if(temp.next == null){
                    tail = temp.next;
                }
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Not Found");
    }

    void mylist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void findOccuren(Node head,int ele,int occurence){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        int count = 0;
        int index = 1;
        while(temp!=null){
            if(count == occurence){
                System.out.println("Found at index " + (index-1));
                return;
            }
            if(temp.data == ele){
                count++;
            }
            index++;
            temp = temp.next;
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,88,9,3,4,6};

        arrayToList list = new arrayToList();

        for(int i=0; i<arr.length; i++){
            list.myadd(arr[i]);
        }
        // list.mydel(10);
        // list.mylist();
        list.findOccuren(head,5,1);
    }
}


// {3,4,5,2,88,9,3,4,6}
// {1,4,6,9,12} // 4 left+(right-left)/2