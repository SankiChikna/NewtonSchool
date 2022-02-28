import java.util.*;
import java.io.*;

class zero{
    public static void main(String[] args)throws IOException {  
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = {1,2,0,4,0,1,2,0,0,0};

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                arr[count++] = arr[i];
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}