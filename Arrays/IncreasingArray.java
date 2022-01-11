class IncreasingArray{
    public static void main(String[] args) {
        int arr [] = {1 ,3 ,8 ,4};
        boolean ans = chk(arr);
        System.out.println(ans);
    }

    static boolean chk(int[] arr){
        int first = arr[0];
        // int converted = 0;
        int checkConverted = 0;
        int flag=1;
        for(int i = 1; i < arr.length; i++){
            int converted = convert(arr[i],first);
            if(converted == 0){
                checkConverted = arr[i];
            }
            else{
                checkConverted = converted;
            }
            if(checkConverted<=first){
                flag=0;
                break;
            }
            first = checkConverted;
        }
        if(flag==0){
            return false;
        }
        return true;
    }

    static int convert(int second,int first){
        for(int i=2;i<second;i++){
            if(second%i==0){
                if(i>first){
                    return i;
                }
            }
        }
        return 0;
    }
}