
public class BankAccount {
	// attributes 
	private String accountNumber;
	private String accountName;
	private double balance;
	
	// constructor
	public BankAccount(String accountNumberIn, String accountNameIn) {
		accountNumber = accountNumberIn;
		accountName = accountNameIn;
		balance = 0;
	}
	
	// get account name 
	public String getAccountName() {
		return accountName;
	}
	
	// get account number 
	public String getAccountNumber() {
		return accountNumber;
	}
	
	// get balance 
	public double getBalance() {
		return balance;
	}
	
	// deposit money 
	public void deposit(double amountIn) {
		balance = balance + amountIn;
	}
	
	// withdraw money
	public boolean withdraw(double amountIn) {
		if(amountIn > balance)
		{
			return false; // no withdrawal made 
		}
		else
		{
			balance = balance - amountIn;
			return true; // withdrawal was successful
		}
	}
}





