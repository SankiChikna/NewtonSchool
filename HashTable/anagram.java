import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Map <Character,Integer> map = new HashMap<Character,Integer>();       
        Map <Character,Integer> map1 = new HashMap<Character,Integer>();

        String str = "anurag";
        String str1 = "garuna";

        for(int i=0;i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str1.length();i++) {
            if(map1.containsKey(str1.charAt(i))) {
                map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
            }
            else{
                map1.put(str1.charAt(i),1);
            }
        }
        for(int i=0;i<map1.size();i++) {
            
        }
    }
}
