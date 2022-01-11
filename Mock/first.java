class first{
    public static void main(String[] args) {
        String str = "madam";
        int bulb=0;
        for(int i=0; i<str.length()/2;i++){ 
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not palindrome");
                bulb = 1;
                break;
            }
        }
        if(bulb==0){
            System.out.println("yes palindrome");
        }
    }
}
