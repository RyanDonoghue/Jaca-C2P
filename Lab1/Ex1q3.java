public class Ex1q3 {

	public static void main(String[] args) 
	{
		int input, index = 0, sum=0;
		
		System.out.println("Please enter a number") ;
	    input = EasyIn.getInt();
		
		if (input > 2)
		{
			while (index <= input)
			{
				if ( index % 2 == 0)
				{
					sum = sum + index;
				}
				index ++ ;
			}
		}
		System.out.println(sum) ;
	    
	}

}
