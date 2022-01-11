import java.util.Scanner;

class usingArray{
    static int arr[] = new int[50];
    static int top = -1;
    static Scanner scanner = new Scanner(System.in);

    static void myadd(){
        if(arr.length-1==top){
            System.out.println("Full");
            return;
        }
        System.out.print("Enter a element : ");
        int val = scanner.nextInt();
        arr[++top] = val;
    }

    static void mydelete(){
        if(top==-1){
            System.out.println("Empty");
            return;
        }
        top--;
    }

    static void mypeek(){
        if(top==-1){
            System.out.println("Empty");
            return;
        }
        System.out.println("Peeked element : "+arr[top]);
    }

    public static void main(String[] args) {
        int ch;
        while(true){
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Peek");
            System.out.println("4.Exit");
            System.out.print("Enter your choice : ");
            ch = scanner.nextInt();
            switch(ch){
                case 1: myadd(); break;
                case 2: mydelete(); break;
                case 3: mypeek(); break;
                case 4: System.exit(0);
            }
        }
    }
}