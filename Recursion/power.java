public class power {
    public static void main(String[] args) {
        System.out.println(calcPower(6,4));
    }
    public static int calcPower(int n,int p){
        int tot=n*n;
        if(p > 1){
            // tot*=calcPower(n,p-1);
            // return calcPower(n,p)*calcPower(n,p-1); 
        }
        // return 0;
        // return tot;
        return tot;
    }
}
