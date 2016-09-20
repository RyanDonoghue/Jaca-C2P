public class BankCustomer {
	private String name = null;
	private String address = null;
	private int savingAccounts = 0; // How many accounts the customer have
	private double totalBalance = 0; // The total balance of the customer's all accounts
	private SavingsAccount[] accounts = new SavingsAccount[3]; // An array to store account object

	public BankCustomer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void addAccount(SavingsAccount account){
		if (savingAccounts<3){
			accounts[savingAccounts] = account;
			savingAccounts++;
			balance();
		}
		else
			System.out.println("Everyone can have up to three SavingsAccounts.");
	}
	
	public double balance(){
		this.totalBalance+=accounts[savingAccounts-1].getSavingsBalance();
		return this.totalBalance;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\n"
				 + "Address: " + this.address + "\n"
				  + "TotalAccounts: " + this.savingAccounts + "\n"
				  + "TotalBalance: " + this.totalBalance;
	}
	
	
	
	
}