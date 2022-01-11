public class anagram {
    static int chars = 256;
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bdac";
        boolean ans = chkPanagram(str1, str2);
        System.out.println(ans);
    }

    static boolean chkPanagram(String str1, String str2) {
        char a []= str1.toCharArray(); 
        char b []= str2.toCharArray(); 
        
        int arr1[] = new int[chars];
        int arr2[] = new int[chars];


        for(int i=0;i<a.length;i++){
            arr1[a[i]]++;
            arr2[b[i]]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
