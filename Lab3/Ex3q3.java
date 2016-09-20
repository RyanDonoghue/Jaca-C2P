
public class Ex3q3 
{

	public static void main(String[] args) 
	{
		sum100();
	}
	public static void sum100()
	{
		int index = 1;
		int result = 0 ;
		while (index != 101)
		{
			result = result + index ;
			index ++ ;
		}
		System.out.println(result);
	}

}
