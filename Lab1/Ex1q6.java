public class Ex1q6
{

	public static void main(String[] args)
	{
		int userInput ;
		System.out.print("Please enter your age: ") ;
		userInput = EasyIn.getInt();
		
		if ( userInput >= 18 )
			{
				System.out.println("Congratulations! You are old enough to vote!") ;
			}	
		else
			{
				System.out.print("Sorry, you are currently not old enough to vote") ;
			}
	}
}
