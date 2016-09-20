
public class Ex2q5 
{

	public static void main(String[] args) 
	{
		int user = 1 ;
		double value ;
		int units ;
		
		while (user != 0)
		{
			System.out.println("Product 1 : 2.98");
			System.out.println("Product 2 : 4.50");
			System.out.println("Product 3 : 9.98");
			System.out.println("Product 4 : 4.49");
			System.out.println("Product 5 : 6.87");
			System.out.println("Press 0 to exit.");
			System.out.println("Please enter which # product you would like to calculate: ");
			user = EasyIn.getInt();
			
			
			switch (user) {
			case 1:
				System.out.println("Please enter the number of units sold");
				units = EasyIn.getInt();
				
				value = units*2.98;
				System.out.println("The retail value of that product is " + value);
				break;
			case 2:
				System.out.println("Please enter the number of units sold");
				units = EasyIn.getInt();
				
				value = units*4.50;
				System.out.println("The retail value of that product is " + value);
				break;
			case 3:
				System.out.println("Please enter the number of units sold");
				units = EasyIn.getInt();
				
				value = units*9.98;
				System.out.println("The retail value of that product is " + value);
				break;
			case 4:
				System.out.println("Please enter the number of units sold");
				units = EasyIn.getInt();
				
				value = units*4.49;
				System.out.println("The retail value of that product is " + value);
				break;
			case 5:
				System.out.println("Please enter the number of units sold");
				units = EasyIn.getInt();
				
				value = units*6.87;
				System.out.println("The retail value of that product is " + value);
				break;
			default:
				System.out.println("Exiting..");
				break;
			}
			
		}
		
	}

}
