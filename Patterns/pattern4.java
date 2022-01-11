public class pattern4 {
    public static void main(String[] args) {
        int row = 5,col=5;
        for(int i=1;i<=row;i++){
            for(int j=col-i+1;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
