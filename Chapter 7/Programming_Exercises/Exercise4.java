/*
• When the program starts, two bank accounts are created, using names and
numbers which are written into the code;
• The user is then asked to enter an account number, followed by an amount to
deposit in that account;
• The balance of the appropriate account is then updated accordingly—or if an
incorrect account number was entered a message to this effect is displayed;
• The user is then asked if he or she wishes to make more deposits;
• If the user answers does wish to make more deposits, the process continues;
• If the user does not wish to make more deposits, then details of both accounts
(account number, account name and balance) are displayed.*/

import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		String accountNumber;
		double amount;
		char response;
		// array of reference
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		// create two bank accounts 
		accountList.add(new BankAccount("Kay Eze", "10096"));
		accountList.add(new BankAccount("Mike Owen", "10092"));
		
		// ask user to enter an account number, followed by an amount to deposit in that account;
		System.out.print("Enter Account Number: ");
		accountNumber = EasyScanner.nextString();
		// deposit money
		System.out.println("Enter amount to deposit: ");
		amount = EasyScanner.nextDouble();
		// check that account number exists
		
		for(BankAccount account: accountList)
		{	
			
			if(!(accountNumber.equals(account.getAccountNumber())))
			{
				System.out.println("Account Number " + "'"+ accountNumber + "'" + " does not exist. Please enter valid account number: ");
				accountNumber = EasyScanner.nextString();
			}
			
			else 
			{
				account.deposit(amount);
				do 
				{
					System.out.print("Do you want to make more deposits? [y/n]: ");
					response = EasyScanner.nextChar();
					if(response == 'y' || response == 'Y')
					{
						System.out.print("Enter amount you wish to deposit: ");
						amount = EasyScanner.nextDouble();
						account.deposit(amount);
						System.out.println();
					}
								
				}while(response == 'y' || response == 'Y');

				
			}
			
			System.out.println();
			System.out.println("Account Name: "+ account.getAccountName());
			System.out.println("Account Number: " + account.getAccountNumber());
			System.out.println("Balance: " + account.getBalance());
		}
		
		
		
		
	}

}






