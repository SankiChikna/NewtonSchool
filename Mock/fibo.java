public class fibo {
    public static void main(String[] args) {
        printFibo(31);
    }
    // 0 , 1 ,1 ,2,3,5,8....
    public static void printFibo(int num){
        int a = 0;
        int b = 1;
        // int c = 0;

        while(a<=num){
            System.out.println(a);
            // a = b;
            a = a+b;
            b = a;
        }
    }
}
