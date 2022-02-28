public class pattern12 {
    public static void main(String[] args) {
        int k=0,row=9,col=5;
        for(int i=1;i<=row;i++){
            if(i<=(row/2)+1){
                k++;
            }else{
                k--;
            }
            for(int j=1;j<=col;j++){
                if(j<=k){ 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
