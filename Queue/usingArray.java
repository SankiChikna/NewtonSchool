class myQueue{
    int front = 0;
    int rear = -1;
    int arr[] = new int[5];
    
    void myadd(int data){
        if(rear == arr.length-1){
            System.out.println("full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    void mypeek(){
        if(rear== -1){
            System.out.println("empty");
            return;
        }
        System.out.println("Peeked element is : "+arr[0]);
    }
    
    void dequeue(){
        if(rear == -1){
            System.out.println("empty");
            return;
        }
        int result = arr[front];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        System.out.println("Deleted element is  : "+result);
    }

}

public class usingArray{
    public static void main(String[] args) {
        myQueue ob = new myQueue();

        ob.myadd(10);
        ob.myadd(20);
        ob.mypeek();
        ob.dequeue();

        ob.myadd(30);
        ob.myadd(40);
        ob.mypeek();
        ob.dequeue();

        ob.myadd(50);
        ob.myadd(60);
        ob.mypeek();
        ob.dequeue();

    }
}
