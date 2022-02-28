public class eight {
    public static void main(String[] args) {
        String str = "my name  is raj"; //raj is  name my // raj is  name 
        String ans = "";
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i) == ' '){
                int j = i+1;
                while(j<str.length() && str.charAt(j) != ' '){
                    ans+=str.charAt(j);
                    // System.out.println(ans);
                    j++;
                }
                ans+=' ';
            }
        }
        // ans+=' ';
        for(int i=0;str.charAt(i) != ' ';i++){
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}

// my name  is raj
// ^^^^^^^^^^^i^^^