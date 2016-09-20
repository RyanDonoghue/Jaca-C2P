
public class Ex2q1 {

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
		System.out.println(output);
	}

}
