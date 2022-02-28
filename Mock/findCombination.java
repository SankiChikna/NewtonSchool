/*
array= {Cookies,cookie, sand , and , cream }       string userinputstring = "Cookiesandcream"   find if this string is available in array , if yes then output commination of array elemnts which are creating this string . note : combinations can be multiple . find out atleast one combinnation 
*/

import java.util.Arrays;

class findCombination{
    public static void main(String[] args) {
        String arr[] = {"Cookies","cookie", "sand" , "and" , "cream" };
        String userinputstring = "Cookiesandcream";

        // Arrays.sort(arr);


        
        System.out.println(Arrays.toString(arr));
    }
}