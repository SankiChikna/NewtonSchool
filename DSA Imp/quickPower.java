class quickPower{
    public static void main(String[] args) {
        System.out.println(calc(2131524,2271,1000000007));
    }

    static long calc(long num,int pow,int modu){
        long result = 1;
        while(pow>0){
            if((pow & 1 )!=0){
                result = (result * pow%modu)%modu;
            }
            num = (num%modu * num%modu)%modu;
            pow = pow>>1;
        }
        return(result);
    }
}