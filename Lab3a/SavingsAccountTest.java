public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount.modifyInterestRate(0.04);
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		
		System.out.println(saver1.toString());
		System.out.println("");
		System.out.println(saver2.toString());
		
		System.out.println("");
		
		
		SavingsAccount.modifyInterestRate(0.05);
		System.out.println(saver1.toString());
		System.out.println("");
		System.out.println(saver2.toString());

	}

}