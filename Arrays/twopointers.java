import java.util.*;
class twopointers{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        b.add(3);
        b.add(3);
        b.add(5);
        System.out.println(merge(a, b));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        // ArrayList<Integer> c = new ArrayList<Integer> ();

        ArrayList <Integer> C= new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i<A.size() && j<B.size()){
            if(A.get(i)<B.get(j)){
                i++;
            }else if(A.get(i)>B.get(j)){
                j++;
            }
            else{
                C.add(A.get(i));
                i++;
                j++;
            }
        }
        return C;
    }
}