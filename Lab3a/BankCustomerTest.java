public class BankCustomerTest {

	public static void main(String[] args) {
		System.out.println("Please enter the customer name:");
		String name = EasyIn.getString();
		System.out.println("Please enter the customer address:");
		 String address = EasyIn.getString();
		System.out.println("Please enter the balance of account 1:");
		double bal1 = EasyIn.getDouble();
		System.out.println("Please enter the balance of account 2:");
		double bal2 = EasyIn.getDouble();
		System.out.println("Please enter the balance of account 3:");
		double bal3 = EasyIn.getDouble();
		
		SavingsAccount.modifyInterestRate(0.04);
		BankCustomer customer1 = new BankCustomer(name, address);
		SavingsAccount account1 = new SavingsAccount(bal1);
		SavingsAccount account2 = new SavingsAccount(bal2);
		SavingsAccount account3 = new SavingsAccount(bal3);

		customer1.addAccount(account1);
		customer1.addAccount(account2);
		customer1.addAccount(account3);
		
		System.out.println(customer1.toString());
	}
}