public class Money{
	public static void main(String [] args){
		int m,n;
		//0.1*m+0.02*n+(100-m-n)=1.5;
		for (m=1;m<100;++m)
			for(n=1;n<100;++n)
			{
				if(m>0&&n>0&&(100-m-n>0)&&(1*m+2*n+(100-m-n)*5==150)){
					System.out.printf("%4d  ",m);
					System.out.printf("%2d  ",n);
					System.out.printf("%2d\n",100-m-n);
				}
			}
	}
}