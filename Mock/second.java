public class second {
    public static void main(String[] args) {
        String name = "anurag kaushik";
        String ans = convert(name);
        System.out.println(ans);
    }

    static String convert(String name) {
        // String str = "";
        String firstName = "";
        String lastName = "";
        for(int i=0;i<name.length();i++) {
            firstName+=name.charAt(i);
            if(name.charAt(i)==' '){
                break;
            }
        }
        for(int i=0;i<name.length()-1;i++){
            if(name.charAt(i) == ' '){
                for(int j=i+1;j<name.length();j++){
                    lastName+=name.charAt(j);
                }
            }
        }
        System.out.println(lastName);
        return lastName+firstName;
    }
}
