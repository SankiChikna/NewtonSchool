import java.util.Arrays;

public class maximumOcurring {
    public static void main(String[] args) {
        // int count = maxOccurance("anurag");
        int count[] = new int[26];
        String str = "anurag";
        char arr[] = str.toCharArray();
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)<=122 && str.charAt(i)>=96){
                count[arr[i]-'a']++;
            }
        }
        System.out.println(Arrays.toString(count));
    }
}
