public class palindrome {
    public static void main(String[] args) {
        String str = "raceadacar";
        boolean ans = isPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }

    static boolean isPalindrome(String str,int l,int r){
        if(l>r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        return isPalindrome(str,l+1,r-1);
    }
}
