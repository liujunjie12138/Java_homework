public class Practice{
	public static void main (String[] args){
		//保存7天的毫秒值，使用int数据类型
		int sevenMonment;
		sevenMonment = 7*24*60*60*1000;
		System.out.printf ("sevenMonment = %d\n",sevenMonment);

		//保存30天的毫秒值，使用long数据类型
		long mouthMonment;
		mouthMonment = 30*7*24*60*1000;
		System.out.printf ("mouthMonment = %d\n",mouthMonment);

		System.out.printlin(3.14E39);//报错
		System.out.printf("min = %f\n",min);

		//判断数组长度是否为final
		int[] a = new int[100];
		System.out.printf("leng = %d\n",a.length);
         //a.length = 101;
         //System.out.printf ("leng = %d\n",a.length);
         //运行这段代码开始报错，说明数组长度是final

        String[][] twoDimensionArr = new String[3][];

        twoDimensionArr[0] = new String[]{"你"，"我","他"}；
        twoDimensionArr[1] = new String[]{"金"，"木" ，"水" ，"火" ，"土" ；
        twoDimensionArr[2] = new String[]{"天"，"地"}；
 

        
