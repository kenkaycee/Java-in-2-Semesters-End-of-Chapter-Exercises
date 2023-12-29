// Bank Application tester
public class BankApplication {
	public static void main(String[] args) {
		int choice;
		Bank myBank = new Bank();
		do
		{
			System.out.println();
			System.out.println("1. Add account");
			System.out.println("2. Remove account");
			System.out.println("3. Retrieve account details");
			System.out.println("4. Deposit money");
			System.out.println("5. Withdraw money");
			System.out.println("6. Total number of accounts in the system");
			System.out.println("7. Display all accounts");
			System.out.println("8. Quit program");
			System.out.println();
			System.out.print("Enter choice 1 - 8 only: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			switch(choice)
			{
			case 1: option1(myBank);break;
			case 2: option2(myBank);break;
			case 3: option3(myBank);break;
			case 4: option4(myBank);break;
			case 5: option5(myBank);break;
			case 6: option6(myBank);break;
			case 7: option7(myBank);break;
			case 8: break;
			default: System.out.println("Invalid entry. Choose from 1 - 8 only!!!");
			}
		}while(choice != 8);
	}
	
	// Add account
	static void option1(Bank bankIn) {
		System.out.print("Enter account number: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter name: ");
		String name = EasyScanner.nextString();
		BankAccount acc = new BankAccount(number, name);// create account to add
		boolean ok = bankIn.addAccount(acc);
		if(ok)
		{
			System.out.println("Account added");
		}
		else
		{
			System.out.println("Account already exists");
		}
	}
	
	// Remove account 
	static void option2(Bank bankIn) {
		System.out.print("Enter the account number of the account you want to remove: ");
		String number = EasyScanner.nextString();
		boolean ok = bankIn.removeAccount(number);
		if(ok)
		{
			System.out.println("Account removed");
		}
		else 
		{
			System.out.println("No such account");
		}
	}
	
	// Retrieve account 
	static void option3(Bank bankIn) {
		System.out.print("Enter the account number you want to retrieve: ");
		String number = EasyScanner.nextString();
		BankAccount acc = bankIn.getAccount(number);
		if(acc != null)
		{
			System.out.println("Account name: " + acc.getAccountName());
			System.out.println("Account Number: " + acc.getAccountNumber());
			System.out.println("Current Balance: " + acc.getBalance());
		}
		else 
		{
			System.out.println("No such account");
		}
	}
	
	// deposit money 
	static void option4(Bank bankIn) {
		System.out.print("Enter the account number you want to deposit money: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter amount to deposit: ");
		double amount = EasyScanner.nextDouble();
		boolean deposit = bankIn.depositMoney(number, amount);
		if(deposit)
		{
			System.out.println("Deposit made");
		}
		else 
		{
			System.out.println("No such account");
		}
	}
	
	// withdraw money 
	static void option5(Bank bankIn) {
		System.out.print("Enter the account number you want you want to withdraw money from: ");
		String number = EasyScanner.nextString();
		System.out.print("Enter amount to withdraw: ");
		double amount = EasyScanner.nextDouble();
		int withdraw = bankIn.withdrawMoney(number, amount);
		if(withdraw == 1)
		{
			System.out.println("Money withdrawn");
		}
		else if(withdraw == -1)
		{
			System.out.println("Error. Insufficient fund");
		}
		else if(withdraw == -2)
		{
			System.out.println("No such account");
		}
	}
	
	// total number of account
	static void option6(Bank bankIn) {
		System.out.println("Number of accounts currently in the system: " + bankIn.getTotalNumberOfAccounts());
	}
	
	// display all accounts
	static void option7(Bank bankIn) {
		System.out.println(bankIn.getAllAccounts());
	}
}












