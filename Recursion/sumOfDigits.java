public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }

    static int sum(int n){
        int sum = 0;
        if(n > 0){
            sum += n%10 + sum(n/10);
        }
        return sum;
    }
}
