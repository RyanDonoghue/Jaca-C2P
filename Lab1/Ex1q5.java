public class Ex1q5 
{

	public static void main(String[] args) 
	{
		int temperature ;
		int index = 32 ;
		System.out.println("Fahrenheit Celcius") ;
		while (index <= 212)
			{	
				temperature = (int) Math.round(5.0/9.0*(index - 32)) ;
				System.out.println("    " + index + "       " + temperature);
				index += 12 ;
			}
	}
}