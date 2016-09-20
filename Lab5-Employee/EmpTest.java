public class EmpTest
{
	private static Employee arrayOfEmployees[];
	private static Boss b;
	private static CommissionWorker c;
	private static PieceWorker p;
	private static HourlyWorker h;
	private static ShiftWorker s;
	
	public static void main(String args[]) 
	{
		b = new Boss ("John", "Smith", 800.00);		
		c = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 150);
		p = new PieceWorker("Bob", "Lewis", 2.5, 200);
		h = new HourlyWorker("Karen", "Price", 13.75, 40);
		s = new ShiftWorker ("Ryan", "Donoghue", 9.45, 40);
	
		arrayOfEmployees = new Employee[5];

		// aim arrayOfEmployees[0] at subclass Boss object
		// aim arrayOfEmployees[1] at subclass CommissionWorker object
		// aim arrayOfEmployees[2] at subclass PieceWorker object
		// aim arrayOfEmployees[3] at subclass HourlyWorker object
		// aim arrayOfEmployees[4] at subclass ShiftWorker object
		arrayOfEmployees[0] = b;
		arrayOfEmployees[1] = c;
		arrayOfEmployees[2] = p;
		arrayOfEmployees[3] = h;
		arrayOfEmployees[4] = s;

		// output each employee surname using the appropriate subclass
		// reference. This demonstrates static binding (see notes)

		System.out.println(b.getLastName());
		System.out.println(c.getLastName());
		System.out.println(p.getLastName());
		System.out.println(h.getLastName());
		System.out.println(s.getLastName());
		
		// Loop through arrayOfEmployees and print their surname, 
		// and earnings. This demonstrates dynamic binding (see notes)
	
		for (int i = 0; i < 5; i++)
			System.out.println(arrayOfEmployees[i].getLastName() 				+ " earns " + arrayOfEmployees[i].earnings());
		
	} // end main
}
 
