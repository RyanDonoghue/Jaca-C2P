
public class Ex3q8 
{

	public static void main(String[] args) 
	{
		int num1 ;
		int num2 ;
		boolean result;
		
		System.out.print("Please enter integer 1:") ;
		num1 = EasyIn.getInt();
		System.out.print("Please enter integer 2:") ;
		num2 = EasyIn.getInt();
		if (num1 == 0 || num2 == 0)
		{
			result = false;
		}
		else
		{
			result = evenlyDivisible ( num1, num2);	
		}
		System.out.print(result) ;
	}
	public static boolean evenlyDivisible(int num1, int num2)
	{
		if (num1%num2==0 || num2%num1==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
