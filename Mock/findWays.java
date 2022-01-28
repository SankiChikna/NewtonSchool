/*
Input:
n = 10 , lengthArray = 4
S[] ={2,5,3,6}
Output: 5
Explanation: Five Possible ways are:
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} 
and {5,5}.
 */

import java.util.*;

public class findWays {
    public static void main(String[] args) {
        int arr[] = {2,5,3,6};
        Arrays.sort(arr); // 2,3,5,6

        int prefix[] = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            prefix[i] = arr[i];
        }
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++) {
            prefix[i] += prefix[i-1];
        }

        System.out.println(Arrays.toString(prefix)); // 2,5,10,16 //    16,14,11,6
    }    
}
