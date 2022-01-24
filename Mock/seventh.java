public class seventh {
    public static void main(String[] args) {
        String str = "aaabbccdaaa";
        String ans = "";
        for(int i=0;i<str.length()-1;){
            int j=i+1;
            int count = 1;
            while(j<str.length() && str.charAt(i)==str.charAt(j)){ //i = 0,j=1,charAr(i) = 'a' charAt(j) = 'a'
                count++;
                j++;
            }
            ans+=str.charAt(i);
            if(count > 1){
                ans+=count;
            }
            // ans+=str.charAt(i)+count;
            // System.out.println(ans+count);
            i = j;
        }
        System.out.println(ans);
    }
}

// {"aaa"} a3


// {"my name is raj"}