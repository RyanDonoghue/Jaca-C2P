public class Ex2q2 {

	public static void main(String[] args) {
		int stars ;
		String output = "" ;
		int index = 0 ;
		
		System.out.println("No. of stars ? (-1 to quit) : ");
		stars = EasyIn.getInt();
		
		do
		{
			while (index < stars)
			{
				output = output + "*" ;
				index ++ ;
			}
			System.out.println(output);
			System.out.println("No. of stars ? (-1 to quit) : ");
			stars = EasyIn.getInt();
		}
		 while (stars != -1);
		
		
	}

}
