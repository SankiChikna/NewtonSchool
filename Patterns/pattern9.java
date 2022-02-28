class pattern9{
    public static void main(String[] args) {
        int row = 5,col = 9,k;
        for(int i=1;i<=row;i++){
            k = 1;
            for( int j=1;j<=col;j++){
                if(j<=row+i-1 && j>=row-i+1){
                    System.out.print(k);
                    if(j<row){
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