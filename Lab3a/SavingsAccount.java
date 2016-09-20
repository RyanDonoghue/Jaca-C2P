public class SavingsAccount {
	static private int totalAccounts = 0;
	static private double annualInterestRate = 0;
	private double savingsBalance = 0;
	private int accountNumber = 0;
	
	public SavingsAccount(double balance) {
		totalAccounts++;
		accountNumber = totalAccounts;
		this.savingsBalance = balance;
	}
	
	public double calculateMonthlyInterest(){
		double monthlyInterest = annualInterestRate / 12 * savingsBalance;
		this.savingsBalance+=monthlyInterest;
		return monthlyInterest;
	}
	
	public static void modifyInterestRate(double newInterestRate){
		annualInterestRate = newInterestRate;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {	
		return "Account Number: "
				 + this.accountNumber + "\n"
				 + "Annual Interest Rate: " + annualInterestRate + "\n"
				 + "Monthly Interest: " + calculateMonthlyInterest() + "\n"
				 + "New Balance: " + this.savingsBalance;
	}

}