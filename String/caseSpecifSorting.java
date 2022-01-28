import java.util.Arrays;

class caseSpecifSorting{
    public static void main(String[] args) {
        String str = "defRTSersUXI";
        char arr[] = str.toCharArray();
        String str1 = "";
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));   [I, R, S, T, U, X, d, e, e, f, r, s]
        String uppercase = "";
        String lowercase = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 97 && arr[i] <= 122){
                lowercase += arr[i];
            }else{
                uppercase += arr[i];
            }
        }
        System.out.println(uppercase + lowercase);
        int i=0;
        int j = 0;
        int k= 0;
        while(str.length()>i){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                str1+=lowercase.charAt(j);
                j++;
            }
            else if(str.charAt(i) <= 90 && str.charAt(i) >= 65){
                str1+=uppercase.charAt(k);
                k++;
            }
            i++;
        }
        System.out.println(str1);
    }
}