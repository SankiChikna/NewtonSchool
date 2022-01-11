public class pangram {
    public static void main(String[] args) {
        String str = 
        "Bawdsjogflickquartzvenymph";
        str = str.toLowerCase();
        int arr[] = new int[26];
        char charArr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            int index = 0;
            if('a'<=arr[i] && arr[i]>='z'){
                index = arr[i]-'a';
            }
            charArr[index] = 1;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(charArr[i]==0){
                System.out.println("false");
            }else
                System.out.println("true");
        }
    }
}
