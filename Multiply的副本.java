public class Multiply{
	public static void main(String [] args){
		int numOne[]={5};
		int numTwo []={9};
		int result []=new int [1];

		multiply(numOne,numTwo,result);
		System.out.println(result[0]);

	}
	public static void multiply(int a[],int b[],int c[]){
		int k=b[0];
		int m=0;
		for(int i=k;k>0;--k){
			m+=a[0];
		}
		c[0]=m;
	}
}