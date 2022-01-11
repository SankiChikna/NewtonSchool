public class pattern11 {
    public static void main(String[] args) {
        int row=5,col=5,k=0;
        for(int i=1;i<=row*2-1;i++){
            if(i<row){
                k++;
            }else{
                k--;
            }
            for(int j=1;j<=col*2-1;j++){
                if(k>=row-k+1 && k<=row+k-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//incomplete

