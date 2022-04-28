class allSubSets{
    public static void main(String[] args) {
        String str = "abc";

        print(str," ");
    }

    static void print(String str, String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }
        print(str.substring(1),output);
        print(str.substring(1),output+str.charAt(0));
    }
}