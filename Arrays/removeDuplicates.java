import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList <Integer>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<a.size();i++){
            set.add(a.get(i));
        }
        // return set.size();
        System.out.println(set.size());
    }
}
