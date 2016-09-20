public class Ex3q5 
{

	public static void main(String[] args) 
	{
		int x ;
		int n ;
		int result=0 ;
		
		System.out.print("Please enter an integer :");
		x = EasyIn.getInt();
		System.out.print("Please enter an even integer :");
		n = EasyIn.getInt();
		if (n%2==0)
		{
			result = power(x,n) ;
			System.out.print(result);
		}
		else 
		{
			System.out.print("Please restart the program and follow the instructions.");
		}
	}
	public static int power (int x ,int n)
	{
		int square = (int) Math.pow(x, n) ;
		return square ;
	}
}
