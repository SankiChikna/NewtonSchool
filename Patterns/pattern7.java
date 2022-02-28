public class pattern7 {
    public static void main(String[] args) {
        int row=5,col=9;
        boolean bulb=true;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j>=row-i+1 && j<=row+i-1 && bulb){
                    System.out.print("*");
                    bulb=false;
                }else{
                    System.out.print(" ");
                    bulb=true;
                }
            }
            System.out.println();
        }
    }
}
