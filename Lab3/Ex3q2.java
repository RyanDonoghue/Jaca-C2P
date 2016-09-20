
public class Ex3q2 
{

	public static void main(String[] args) 
	{
		powersOfTwo();
	}
	public static void powersOfTwo()
	{
		int index = 1;
		int square ;
		
		while (index != 11)
		{
			square = (int) Math.pow(2, index) ;
			System.out.println(square);
			index ++ ;
		}
	}

}
