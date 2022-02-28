import java.util.Scanner;
class finddelete{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String st,st1;
		int ch,num;
		System.out.print("Enter a string :");
		st = scan.nextLine();
		do{
			System.out.println("1.Toggle case ");
			System.out.println("2.Palindrome");
			System.out.println("3.Insert");
			System.out.println("4.Title case");
			System.out.println("5.Search");
			System.out.println("6.Replace");
			System.out.println("7.Find and Delete");
			System.out.println("8.Sort name-wise");
			System.out.println("9.Sort surname-wise");
			System.out.println("10.Exit");
			System.out.println("Enter your choice");
			ch=scan.nextInt();
			switch(ch){
				case 1: toggle_case(st);break;//done
				case 2: palindrome(st);break;//done
				case 3: scan.nextLine();
						System.out.println("Input 2nd string");
						st1 = scan.nextLine();
						insert(st,st1);//done
						break;
				case 4: title_case(st);break;//done
				case 5: scan.nextLine();
						System.out.println("Input 2nd string");
						st1 = scan.nextLine();
						search(st,st1);//not done
						break;
				case 6: scan.nextLine();
						System.out.println("Input 2nd string");
						st1 = scan.nextLine();
						System.out.println("Input string to replace");
						String st2=scan.nextLine();
						replace(st,st1,st2);//done
						break;
				case 7: scan.nextLine();
						System.out.println("Input 2nd string");
						st1 = scan.nextLine();
						find_del(st,st1);
						break;
				case 8: scan.nextLine();
						System.out.println("Enter how many strings");
						num = scan.nextInt();
						sort_name(num);//done
						scan.nextLine();
						break;
				case 9: scan.nextLine();
						System.out.println("Enter how many strings");
						num = scan.nextInt();
						surname_wise(num);
						scan.nextLine();
						break;
				case 10:System.out.println("Exiting....");
						System.exit(1);
			}
		}while(ch!=10);
	}
	static void toggle_case(String st){
		char ch[] = st.toCharArray();
		int i=0;
		while(i<st.length()-1){
			if(Character.isUpperCase(ch[i]))
				ch[i]+=32;
			else
				ch[i]-=32;
			i++;
		}
		String st1=new String(ch);
		System.out.println(st1);
	}
	static void palindrome(String st){
		StringBuffer st1 = new StringBuffer(st);
		st1=st1.reverse();
		String st2 = new String(st1);
		int compare = st.compareToIgnoreCase(st2);
		if(compare == 0)
			System.out.println("Yes! Palindrome");
		else
			System.out.println("No! not a Palindrome");
	}
	static void insert(String st,String st1){
		StringBuffer st2=new StringBuffer(st);
		//StringBuffer st3=new StringBuffer(st1);
		Scanner scan = new Scanner(System.in);
		System.out.print("ENter position");
		int pos = scan.nextInt();
		st2.insert(pos+1,st1);
		System.out.println(st2);
	}
	static void title_case(String st){
		char ch[] = st.toCharArray();
		if(Character.isLowerCase(ch[0]))
			ch[0]-=32;
		int i=0;
		while(i<st.length()-1){
			if(ch[i]==' ')
				ch[i+1] -= 32; 
			i++;
		}
		String st2=new String(ch);
		System.out.println(st2);
	}
	static void search(String st,String st1){
		int count=0;
		for(int i=0;i<st.length();i++){
			if(st.indexOf(st1)>0)
				count++;
		}
		System.out.println("No of occurence are :"+count);
	}
	static void replace(String st,String st1,String st2){
		st=st.replace(st1,st2);
		System.out.println(st);
	}
	static void find_del(String st,String st1){
		if(st.contains(st1)){
			st=st.replace(st1,"");
			System.out.println(st);
		}
		else
			System.out.println("not found");
	}
	static void sort_name(int num){
		String st[] = new String[num];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<st.length;i++)
			st[i]=scan.nextLine();
		int p,j,t;
		String temp="";
		for(int i=0;i<st.length-1;i++){
			temp=st[i];
			p=i;
			for(j=i+1;j<st.length;j++){
				int compare = st[j].compareToIgnoreCase(temp);
				if(compare<0){
					temp=st[j];
					p=j;
				}
			}
			if(p!=i){
				st[p]=st[i];
				st[i]=temp;
			}
		}
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
	}
	static void surname_wise(int num){
		String st[] = new String[num];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<st.length;i++)
			st[i]=scan.nextLine();
		int p,j,t;
		String [] split= st[0].split(" ");
		String lastname1 = String.valueOf(split);
		System.out.println(lastname1);
		String temp="";
	}
	
}
