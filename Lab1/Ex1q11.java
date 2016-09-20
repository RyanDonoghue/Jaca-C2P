
public class Ex1q11 
{

	public static void main(String[] args) 
	{
		String unicode ;
		int index = 32;
		int counter = 0;
		
		while (index != 127) 
		{
			counter++ ;
			unicode = Character.toString((char)index);
			System.out.println(index + " " + unicode);
			index++ ;
			if (counter % 25 == 0)
			{
				Keyboard.readChar();
			}
		}
	}

}
