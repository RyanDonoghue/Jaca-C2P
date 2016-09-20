
public class Ex2q7 
{

	public static void main(String[] args) 
	{
		int num1 ;
		int num2 ;
		boolean correct = false ;
		int input = 0 ;
		int ans ;
		
		
		while (input != -1)
		{
			correct = false ;
			num1 = (int) Math.ceil(Math.random()*10) ;
			num2 = (int) Math.ceil(Math.random()*10) ;
			System.out.println("How much is " + num1 + " times " + num2 + "?" + "(-1 to quit)");
			input = EasyIn.getInt() ;
			ans = num1*num2 ;
			if (input == ans)
			{
				System.out.println("Very good!") ;
			}
			else 
			{
				while (correct == false)
				{
					System.out.println("No, please try again.") ;
					System.out.println("How much is " + num1 + " times " + num2 + "?" + "(-1 to quit)");
					input = EasyIn.getInt() ;
					if (input == ans)
					{
						System.out.println("Very good!") ;
						correct = true;
					}
				}
			}
			
		}		
	
	}
}