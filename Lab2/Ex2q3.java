
public class Ex2q3 {

	public static void main(String[] args) {
		int stars ;
		String output = "" ;
		int index = 0 ;
		
		System.out.println("No. of stars? ");
		stars = EasyIn.getInt();
		
		while (index < stars)
		{
			output = output + "*" ;
			index ++ ;
		}
		
		index = 0 ;
				
		while (index < stars)
		{
			System.out.println(output);
			output = output.substring(0, output.length() - 1);
			index ++ ;
		}
			
	}

}
