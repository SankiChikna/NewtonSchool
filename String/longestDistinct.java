/*
Given a string S, find the length of the longest substring with all distinct characters of string S.
For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.
Input
The first line of input contains an integer T denoting the number of test cases.
The first and the only line of each test case contains the string S.

Constraints:
1 ≤ T ≤ 100
1 ≤ length of S ≤ 1000
Output
Print length of longest substring containing all the distinct characters of string.
Note: The output substring should have all distinct characters.
 */

import java.io.*;
import java.util.Arrays; 
 class longestDistinct{
     public static void main(String[] args)throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int t = Integer.parseInt(reader.readLine());
         while(t-->0){
             String str = reader.readLine();
             int arr[] = new int[256];
             Arrays.fill(arr,-1);
             int res = 0;
             int j = 0;
             for(int i=0;i<str.length();i++){
                 int index = str.charAt(i);
                 j = Math.max(j,arr[index]+1);
                 res = Math.max(res,i-j+1);
                 arr[index] = i;
             }
             System.out.println(res);
         }
     }
 }