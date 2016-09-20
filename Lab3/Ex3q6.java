
public class Ex3q6 
{
	public static void main(String[] args) 
	{
		String sentence ;
		char search ;
		int result ;
		
		System.out.print("Enter a string or sentence: ");
		sentence = EasyIn.getString();
		System.out.print("Please enter a character to search for: ");
		search = EasyIn.getChar();
		
		result = searchString(sentence, search);
		System.out.print(search + " appears in the string " + "'" + sentence + "' " + result + " times.") ;
	
	}
	public static int searchString (String sentence, char search)
	{
		int index = 0 ;
		char currChar ;
		int counter = 0 ;
		while (index < sentence.length())
		{
			currChar = sentence.charAt(index);
			if (currChar == search)
			{
				counter ++ ;
			}
			index++ ;
		}
		return counter ;
	}
}
