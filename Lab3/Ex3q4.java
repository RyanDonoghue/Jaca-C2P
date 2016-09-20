
public class Ex3q4 
{

	public static void main(String[] args) 
	{	double converted;
		double temp = 0;
		double fahren ;
		
		
		System.out.println("Please enter a temperature in degrees farenheit: ");
		fahren = EasyIn.getDouble();
		converted = fahrenToCel(fahren,temp) ;
		System.out.println(converted);
	}
	public static double fahrenToCel (double fahren, double temp)
	{
		temp = (5.0/9.0*(fahren - 32)) ;
		return temp ;
	}
}
