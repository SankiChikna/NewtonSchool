public class firstAppearance {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        for(int i=0;i<str.length();i++){
            int flag=0;
            for(int j=i+1;j<str.length()-1;j++){   
                if(i>=str.length()-1){
                    System.out.println("-1");
                }
                if(str.charAt(j)==str.charAt(i)){
                    System.out.println(str.charAt(i));
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
    }
}
