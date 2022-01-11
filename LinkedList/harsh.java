public class harsh {
    public static void main(String[] args) {
        int value =1;
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<value; j++){
                System.out.print("A");
            }
            if(i>=4)
                value--;
            else
                value++;
            System.out.println();
        }
    }
}
