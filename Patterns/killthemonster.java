import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] values = str.split(" ");

		int N = Integer.parseInt(values[0]);
		int D = Integer.parseInt(values[1]);
		int H = Integer.parseInt(values[2]);

		str = sc.nextLine();
		String []powers = str.split(" ");
		// System.out.println(Arrays.toString(powers));
		
		str = sc.nextLine();
		String []weights = str.split(" ");
		// System.out.println(Arrays.toString(weights));

		int index = 0;
		ArrayList <Integer> arr = new ArrayList<>();

		int count = 0;
		int tot = 0;
		for(;index<N;index++){
			int weight = Integer.parseInt(weights[index]);
			int power = Integer.parseInt(powers[index]);
			if(D>weight && tot<H){
				tot+=Integer.parseInt(powers[index]);
				count++;
			}
		}
		if(H<=tot){
			System.out.println(count);
		}else{
			System.out.println(-1);
		}
	}
}