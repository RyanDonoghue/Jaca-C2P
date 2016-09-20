
public class Ex1q4 
{

	public static void main(String[] args) 
	{
		int index = 1 ;
		int square ;
		int cube ; 
		
		System.out.println("Number Square Cube");
		while (index != 6)
		{
			square = (int) Math.pow(index, 2) ;
			cube = (int) Math.pow(index, 3) ;
			System.out.println("  " + index + "      " + square + "     " + cube);
			index ++ ;
		}
	}

}
