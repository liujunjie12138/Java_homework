public class YearDay{
	public static void main(String [] args){
		long minute=3456789;

		convert(minute);
	}
	public static void convert(long minute){
		long year;
		long day;

		year=minute/(365*24*60);
		day=(minute/(24*60))%365;

		System.out.print(year+"年");
		System.out.print("  ");
		System.out.println(day+"天");
	}
}