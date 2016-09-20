
public class Ex1q8 
{

	public static void main(String[] args) 
	{
		int temperature ;
		int index = 32 ;
		String comment = "" ;
		
		System.out.println("Fahrenheit Celcius") ;
		while (index <= 212)
			{	
				temperature = (int) Math.round(5.0/9.0*(index - 32)) ;
				if (20 >= temperature )
					{
						comment = "Cold";
					}
				else if (20 <= temperature && temperature <= 50)
					{
						comment = "Warm" ;
					}
				else
					{
						comment = "Hot" ;
					}
				System.out.println("    " + index + "       " + temperature + " " + comment);
				index += 12 ;
				
			}
	}

}