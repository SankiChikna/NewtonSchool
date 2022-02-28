public class subSequence {
    public static void main(String[] args) {
        String str = "anurag";
        noOfWays(str,0," ");
    }

    static void noOfWays(String str,int len,String s) {
        if(len == str.length()){
            System.out.print(s+" ");
            return;
        }
        noOfWays(str,len+1,s+str.charAt(len));
        noOfWays(str,len+1,s);
    }
}
