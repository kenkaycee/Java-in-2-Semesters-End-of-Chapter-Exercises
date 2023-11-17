import java.util.ArrayList;

public class Bank {
	// attributes 
	private ArrayList<BankAccount> list = new ArrayList<>();
	
	// methods 
	// a helper method that returns the index of an account 
	private int search(String accountNumberIn) {
		for(int i = 0; i <= list.size()-1; i++)
		{
			BankAccount tempAccount = list.get(i); 
			String tempAccNumber = tempAccount.getAccountNumber();
			if(tempAccNumber.equals(accountNumberIn))
			{
				return i; // return the index 
			}
		}
		return -999;
	}
	
	// get the account details of a specified account number 
	public BankAccount getItem(String accountNumberIn) {
		int index = search(accountNumberIn);
		if(index != -999) // Check account exists
		{
			return list.get(index);
		}
		else
		{
			return null;
		}
	}
	
	// get total items in a list 
	public int getTotal() {
		return list.size();
	}
	
	// add an item the list 
	public boolean addAccount(String accountNumberIn, String accountNameIn) {
		if(search(accountNumberIn) == -999) // check account does not already exists
		{
			list.add(new BankAccount(accountNumberIn, accountNameIn));
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// remove an item from the list 
	public boolean removeAccount(String accountNumberIn) {
		int index = search(accountNumberIn);
		if(index != -999) // check account exists 
		{
			list.remove(index);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// deposit money 
	public boolean depositMoney(String accountNumberIn, double amountIn) {
		BankAccount acc = getItem(accountNumberIn);
		if(acc != null) // check account exists 
		{
			acc.deposit(amountIn);
			return true; // indicate success 
		}
		else
		{
			return false; // indicate failure 
		}
	}
	
	/*
	 * Adapt the withdrawMoney method so that it distinguishes the two reasons
why the method might fail—namely that there is no account with the given
account number, or there is not enough money in the account to make a
withdrawal.
A boolean method would no longer suffice as there is more then one possibility. One solution would be for the method to return an integer—perhaps 1
for success, −1 to indicate that the method failed because there was no such
account number, and −2 to indicate that it failed because there were insufficient
funds.
	 */
	
	// withdraw money 
	public int withdrawMoney(String accountNumberIn, double amountIn) {
		BankAccount acc = getItem(accountNumberIn);
		if(acc != null)
		{
			if(acc != null && amountIn > acc.getBalance())
			{
				return -1; // indicate failure due to insufficient funds
			}
			else if (acc != null && amountIn <= acc.getBalance())
			{
				acc.withdraw(amountIn);
				return 1;
			}
		}
		
		else if(acc == null)
		{
			return -2; // indicate failure because no such account 
		}
		return 0;
					
	}
}





























