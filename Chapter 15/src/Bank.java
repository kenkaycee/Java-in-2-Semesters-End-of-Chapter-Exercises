/**
 * Re-write the Bank class of Chap. 8 so that it makes use of a Map instead of a
List, as discussed in self-test question 6 above.
 */

/**
 * @author Kaycee Ezenta
 * @version 26th dec 
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bank{
	// attributes 
	private Map<String, BankAccount> accounts;
	
	// constructor
	public Bank() {
		accounts = new HashMap<>();
	}
	
	// add a bank account into the collection
	public boolean addAccount(BankAccount bankAccountIn) {
		String accountNumberIn = bankAccountIn.getAccountNumber(); // account number will be key of map
		if(accounts.containsKey(accountNumberIn)) // check if account number already in use			
		{
			return false; // indicate error
		}
		else 
		{
			accounts.put(accountNumberIn, bankAccountIn); // add key and Bank Account pair into map
			return true; 
		}
	}
	
	// remove account with a given account number 
	public boolean removeAccount(String accountNumberIn) {
		if(accounts.remove(accountNumberIn)!= null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	// return the BankAccount with the given account number or null if no such Bank Account
	public BankAccount getAccount(String accountNumberIn) {
		return accounts.get(accountNumberIn);
	}
	
	// deposit money for a given account number
	public boolean depositMoney(String accountNumberIn, double amountIn) {
		BankAccount bankAccountIn = accounts.get(accountNumberIn);
		if(bankAccountIn != null) // check account exist
		{
			bankAccountIn.deposit(amountIn);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// withdraw money for a given account number 
	public int withdrawMoney(String accountNumberIn, double amountIn) {
		BankAccount bankAccountIn = accounts.get(accountNumberIn);
		if(bankAccountIn != null) // check that account exists
		{
			if(bankAccountIn.getBalance() >= amountIn) // check current balance is not less than the amount to be withdrawn
			{
				bankAccountIn.withdraw(amountIn);
				return 1; // withdrawal made
			}
			else
			{
				return -1; // no withdrawal due to insufficient fund
			}
		}
		else 
		{
			return -2; // no such account 
		}
	}
	
	// return the number of accounts in the collection 
	public int getTotalNumberOfAccounts() {
		return accounts.size();
	}
	
	// return the set of accounts in the collection 
	public Set<BankAccount> getAllAccounts(){
		Set<BankAccount> bankAccountSet = new HashSet<>(); // to store the set of bank accounts 
		accounts.forEach((accountNumber, bankAccount) -> bankAccountSet.add(bankAccount)); // use forEach loop to add books
		return bankAccountSet; // return set of Bank accounts 
	}
	
}










