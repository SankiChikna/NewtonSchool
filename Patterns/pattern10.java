public class pattern10 {
    public static void main(String[] args) {
        int row=5,col=9;
        char ch;
        for(int i=1;i<=row;i++) {
            ch = 'A';
            for(int j=1;j<=col;j++) {
                if(j<=row-i+1 || j>=row+i-1){
                    System.out.print(ch);
                    if(j<row){
                        ch++;
                    }    
                    else{
                        ch--;
                    }
                }else{
                    System.out.print(" ");
                    if(j==row){
                        ch--;
                    }
                }
            }
            System.out.println();
        }
    }
}
