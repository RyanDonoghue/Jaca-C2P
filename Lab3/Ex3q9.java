
public class Ex3q9 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a String:");
		String someString = EasyIn.getString();
		System.out.println("Please enter the number of concatenations:");
		int someInt = EasyIn.getInt();
		if (someInt > 2)
		{
			String resultString = multiConcat (someString,someInt );
			System.out.println(resultString);
		}
		else
		{
			System.out.println(someString);
		}
		
	}
	public static String multiConcat (String someString, int someInt)
	{
		int index = 0;
		String concat = "" ;
		while (index < someInt)
		{
			concat = concat + someString;
			index++ ;
		}
		return concat;
			
	}
}
