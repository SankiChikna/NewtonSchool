public class pattern3 {
    public static void main(String[] args) {
        int row = 5,col = 5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=5;j++){
                if(j>=(col+1)-i){
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
