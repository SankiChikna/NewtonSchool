public class pattern14 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++){
            int k =i;
            for(int j=1;j<=row*2-1;j++){
                if(j>=row+1-i && j<=row-1+i){
                    System.out.print(k);
                    if(k<4){
                        k++;
                    }else{
                        k--;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
