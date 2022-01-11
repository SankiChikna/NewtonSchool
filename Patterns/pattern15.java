public class pattern15 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                int k=1;
                if(j>=1 && j<=i*2-1){
                    System.out.print(k);
                    if(k<j){
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
