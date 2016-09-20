
public class Ex2q4 {

	public static void main(String[] args) 
	{
		int input ;
		int factorial = 0 ;
		
		System.out.println("Please enter an integer between 1 and 10 :");
		input = EasyIn.getInt();
		
		if ( input <= 10 && input >= 1)	
		{
			if (factorial == 0)
			{
				factorial = input*(input - 1) ;
				input -- ;
			}
			while (input != 1)
			{
				factorial = factorial* (input - 1) ;
				input --;
			}
			System.out.println(factorial);
		}
	}

}
