import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class aa {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[0]);
		String btr[] = sc.nextLine().split(" ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(btr[i]);
		}
		for(int i=0;i<n-k-1;i++){
			int max=0;
			for(int j=0,p=i;j<k;j++,p++){
				if(arr[p]>max)
					max = arr[p];
			}
			System.out.print(max+" ");
		}

	}
}