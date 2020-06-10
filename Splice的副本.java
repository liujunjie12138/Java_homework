public class Splice{
	public static void main (String [] args){
		int spl []={13,26,-3,4,54,26,37,18,69,-10};
		Splprint(spl);

	}
	public static void Splprint(int arr[]){
		for(int i=0;i<arr.length;++i){
			System.out.print("["+i);
			System.out.print("]");
			System.out.print("="+arr[i]);
			System.out.print("  ");
			if(i%5==0&&i>0)
				System.out.println();
		}
		System.out.println();
	}
} 
