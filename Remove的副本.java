public class Remove{
	public static void main (String [] args){
		int Sim[]={1,2,3,1,2,3,4,4,6,3,2,6,8};
		int Dif[]=new int [20];

		Dif=filtArray(Sim);

		for(int i=0;i<Dif.length;++i){
			System.out.printf("%2d  ",Dif[i]);
		}
		System.out.println();


	}
	public  static int [] filtArray(int Sim[]){
		int sim[]=new int[20];
		int i,j;
		j=0;
		int m,n;
		for(i=0;i<Sim.length;++i)
		{
			if(sim[j]!=Sim[i]){
				sim[j]=Sim[i];
				j=0;
				i=0;

			}
			else{
				++i;
				++j;
			}
		}
	

		return sim;

	}
}