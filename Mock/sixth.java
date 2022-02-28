import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class sixth {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,9,10,11,15}; //19>13
        int sum = 13;

        // Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                if(x+arr[j]+arr[k] == sum){
                    count++;
                    j++;
                    k--;
                }else if(x+arr[j]+arr[k]>sum){
                    k--;
                }else{
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}

//1 2 3 4 5

