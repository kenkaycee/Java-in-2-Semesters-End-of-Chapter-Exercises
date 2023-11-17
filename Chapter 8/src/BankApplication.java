
public class BankApplication {

	public static void main(String[] args) {
		int choice;
		Bank myBank = new Bank();
		do {
			System.out.println();
			System.out.println("1. Create new account");
			System.out.println("2. Remove an account");
			System.out.println("3. Deposit money");
			System.out.println("4. Withdraw money");
			System.out.println("5. Check account Details");
			System.out.println("6. Total number of bank accounts");
			System.out.println("7. Quit");		
			System.out.println();
			System.out.print("Enter choice [1 - 7]: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			
			// process menu options
			switch(choice)
			{
			case 1: option1(myBank);break;
			case 2: option2(myBank); break;
			case 3: option3(myBank); break;
			case 4: option4(myBank); break;
			case 5: option5(myBank); break;
			case 6: option6(myBank); break;
			case 7: break;
			default: System.out.println("Invalid entry. Enter  1 - 7 only: ");
			}
		}while(choice != 7);
		
	}
	
	// add account
	
	public static void option1(Bank bankIn) {
		// get details from user 
		System.out.print("Enter Account Number: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter Account Name: ");
		String name = EasyScanner.nextString();
		boolean success = bankIn.addAccount(number, name);
		if(success)
		{
			System.out.println("Account added.");
		}
		else
		{
			System.out.println("Account already exists.");
		}
	}
	
	// remove an account
	
	public static void option2(Bank bankIn) {
		System.out.print("Enter Account Number: ");
		String number = EasyScanner.nextString();
		boolean success = bankIn.removeAccount(number);
		if(success)
		{
			System.out.println("Account number removed");
		}
		else
		{
			System.out.println("No such account");
		}
	}
	
	// deposit money 
	public static void option3(Bank bankIn) {
		System.out.print("Enter Account Number: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter amount to deposit: ");
		double amount = EasyScanner.nextDouble();
		boolean found = bankIn.depositMoney(number, amount);
		if(found)
		{
			System.out.println("money deposited");
		}
		else
		{
			System.out.println("No such account");
		}
		
		
	}
	/**
	 * (b) Adapt the BankApplication program from Sect. 8.8.2 so that option 4 now
uses the new version of withdrawMoney.
	 * @param bankIn
	 */
	
	// withdraw money 
	public static void option4(Bank bankIn) {
		System.out.print("Enter Account Number: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter amount to withdraw: ");
		double amount = EasyScanner.nextDouble();
		int found = bankIn.withdrawMoney(number, amount);
		if(found == 1)
		{
			System.out.println("Withdrawal successful");
		}
		else if(found == -1)
		{
			System.out.println("Insufficent funds");
		}
		else if(found == -2)
		{
			System.out.println("No such account");
		}
	}
	
	// check account details 
	public static void option5(Bank bankIn) {
		System.out.print("Enter Account Number: ");
		String number = EasyScanner.nextString();
		BankAccount acc = bankIn.getItem(number);
		if(acc != null)
		{
			System.out.println("Account name: " + acc.getAccountName());
			System.out.println("Account number: " + acc.getAccountNumber());
			System.out.println("Balance: " + acc.getBalance());
		}
		else
		{
			System.out.println("No such account");
		}
	}
	
	// get total number of accounts
	public static void option6(Bank bankIn) {
		System.out.println("Total number of accounts in the system: " + bankIn.getTotal());
	}

}













