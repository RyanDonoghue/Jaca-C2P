
public class Ex3q10 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter an integer:");
		int integer = EasyIn.getInt();
		System.out.println("Factorial: " + (factorial(integer)));	
	}
	public static int factorial ( int integer)
	{
		int index = integer ;
		int result = integer ;
		while (index <= integer && index != 1)
		{
			index -- ;
			result = result * index;
		}
		
		return result ;
	}
}
