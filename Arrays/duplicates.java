import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>();
        a.add(500);
        a.add(500);
        a.add(500);
        
        if(a.size()<2){
            // return a.size();
            System.out.println(a);
        }
        int j=0;
        int temp[] = new int[a.size()-1];
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)!=a.get(i+1)){
                temp[j++] = a.get(i);
            }
        }
        temp[j++] = a.get(a.size()-1);
        for(int i=0;i<j;i++){
            a.set(i,temp[i]);
            System.out.println(a.get(i));
        }
        // return j;
        // System.out.println(a);
    }
}
