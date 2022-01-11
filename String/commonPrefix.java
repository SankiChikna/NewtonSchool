import java.util.Arrays;

public class commonPrefix {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks","geeks" ,"geek", "geezer"};
        Arrays.sort(arr);
        String ans = compute(arr);
        System.out.println(ans);
    }

    static String compute(String[] arr) {
        String str="";
        int min = arr[0].length();
        int i=0;
        while(min>i && arr[0].charAt(i) == arr[arr.length-1].charAt(i)){
            str+=arr[i].charAt(i);
            i++;
        }
        return str;
    }
}
