public class Ex2q8 
{

	public static void main(String[] args) 
	{
		int index = 2 ;
		int counter ;
		int input ;
		int currentNum ;
		boolean test ;
		
		System.out.print("Please enter an even integer: ");
		input = EasyIn.getInt();
		if (input%2 != 0)
		{
			System.out.println("Odd integer entered, please restart the program and enter an even number.  ");
		}
		else 
		{
			System.out.print("The prime numbers up to the number " + input + " are:");
			System.out.println("\n-----------------------------------------");
		}
		while (input != -1 && input%2 == 0)
		{
			while (input > index)
			{
				currentNum = index ;
				counter = 2 ;
				test = true ;
				
				while (counter < currentNum)
				{
					if (currentNum % counter == 0)
					{
						test = false ;
					}
					
					counter ++ ;
				}
				
				if (test == true)
				{
					System.out.println(currentNum + "");
				}
				index ++ ;
			}
		}
			
		
	}

}
