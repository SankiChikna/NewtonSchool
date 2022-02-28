public class pattern16 {
    public static void main(String[] args) {
        int n = 3;
        for(int i=1,k=3;i<=n;i++,k--){
            int a = 3;
            for(int j=1;j<=n*n;j++){
                // int count=1;
                if(j<=n*k){
                    for(int count=n;count>=i;count--){
                        System.out.print(a);
                    }
                    if(a<2){
                        break;
                    }
                    a--;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("$");
        }
    }
}
