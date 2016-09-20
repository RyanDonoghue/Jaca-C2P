public class Ex1q7
{

	public static void main(String[] args) 
	{
		int temperature ;
		String result = ""	;
		
		System.out.print("Please enter a temperature for evaluation: ") ;
		temperature = EasyIn.getInt();
		if (5 >= temperature && temperature >= -10)
			{
				 result = "Very Cold" ;
			}
		else if (15 >= temperature && temperature >= 6)
			{
				result = "Cold";
			}
		else if (22 >= temperature && temperature >= 16)
			{
				result = "Warm";
			}
		else if (15 >= temperature && temperature >= 6)
			{
				result = "Hot";
			}
		else
			{
				System.out.println("Error, temperature out of range") ;
			}
			
		System.out.println(result);
	}
}
