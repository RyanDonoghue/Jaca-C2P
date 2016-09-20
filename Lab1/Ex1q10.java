
public class Ex1q10 
{

	public static void main(String[] args) 
	{
		int input ;
		int numbers = 0 ;
		int highest = 0 ;
		int lowest = 0 ;
		
		
		System.out.println("Please enter a number") ;
		input = EasyIn.getInt() ;
		
		while (input != 0)
		{
			numbers ++ ;
			if (lowest == 0)
			{
				lowest = input ;
			}
			if (input > highest)
			{
				highest = input ;
			}
			if (input < lowest)
			{
				lowest = input;
			}
			
			System.out.println("Please enter another number") ;
			input = EasyIn.getInt() ;
		}
		System.out.println("Sentinel number detected, exiting.r") ;
		System.out.println("The number of numbers is: " + numbers) ;
		System.out.println("The highest number is: " + highest) ;
		System.out.println("The lowest is: " + lowest) ;
		
	}

}
