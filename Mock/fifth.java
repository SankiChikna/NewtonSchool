import java.util.Arrays;

class fifth{
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,12,13,14};
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 3, 5, 7, 12, 13, 14]
        int index = find(arr,0,arr.length-1,3);
        if(index==-1){
            System.out.println("Not found");
        }
        else
            System.out.println("Fount at "+index);
    }

    static int find(int arr[],int first,int last,int key){
        while(first<=last){
            int mid = (last+first)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key){
                last = mid-1;
            }
            else
                first = mid+1;
        }
        // System.out.println("Not found ");
        return -1;
    }
}