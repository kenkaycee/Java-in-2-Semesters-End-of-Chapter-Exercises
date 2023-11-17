
public class BankAccount {
	// attributes 
	private String accountName;
	private String accountNumber;
	private double balance;
	
	// constructor
	public BankAccount(String accountNameIn, String accountNumberIn) {
		accountName = accountNameIn;
		accountNumber = accountNumberIn;
		balance = 0;
	}
	
	// methods to deposit and withdraw money
	public void deposit(double amountIn) {
		balance = balance + amountIn;
	}
	
	public boolean withdraw(double amountIn) {
		if(amountIn > balance)
		{
			return false; // withdrawal not successful
		}
		else
		{
			balance = balance - amountIn;
			return true; // withdrawal successful
		}
	}
	
	// methods to get account details 
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}

}
