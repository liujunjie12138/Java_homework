
public class Sortarr{
	public static void main(String [] args){
		int[] arr={8,3,4,9,6,2,5,7,0,1};
		boolean isAsc; 

		//isAsc=true;
		isAsc=false;

		sort (arr,isAsc);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<11;++i)
			System.out.printf("%2d\n",arr[i]);
		sort (arr);
		for(int i=0;i<11;++i)
			System.out.printf("%2d\n",arr[i]);


	}

 public static void sort(int[] arr,boolean isAsc){
	int i,j;
	int temp;
	//boolean isBbc=true;
		if (isAsc==true){
	         for(i=0;i<9;++i)
				for(j=i+1;j<10;++j){
					if(arr[i]>arr[j]){
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}			

			}
		else{
			  for(i=0;i<9;++i){
				 for(j=i+1;j<10;++j){
					if(arr[i]<arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}

				}

			}
		}


}
public static void sort (int arr[]){
	int i,j;
	int temp;
	for(i=0;i<9;++i)
	   for(j=i+1;j<10;++j){
		   if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						}
					}			

}
}
