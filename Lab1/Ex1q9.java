
public class Ex1q9 
{

	public static void main(String[] args) 
	{
		int numberCounter = 1 ;
		int currentNumber ;
		int highest = 0 ;
		boolean test = false ;
		
		while (numberCounter != 11)
		{
			System.out.println("Please enter number " + numberCounter + ": ");
			currentNumber = EasyIn.getInt() ;
			
			if (currentNumber > highest)
			{
				highest = currentNumber ;
				test = true ;
			}
			numberCounter++;
		}
		if ( test == true)
		{
			System.out.println("The highest number is : " + highest);
		}
		else 
		{
			System.out.println("All numbers entered were zero, please try again.");
		}
	}

}
