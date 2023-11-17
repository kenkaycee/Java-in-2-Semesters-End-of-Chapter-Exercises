/* Exercise 2
 
 */

public class BankAccountTester {
	public static void main(String[] args) {
		/** 2. (a) Write the code that will create two BankAccount objects, acc1 and
		acc2. The account number and account name of each should be set at the
		time the object is created. */
		
		BankAccount acct1 = new BankAccount("Kay Eze", "0090");
		BankAccount acct2 = new BankAccount("Ugo Okoh", "1009");
		
		/*(b) Write the lines of code that will deposit an amount of 200 into acc1 and
			100 into acc2.*/
		acct1.deposit(200);
		acct2.deposit(100);		
		
		/*(c) Write the lines of code that attempt to withdraw an amount of 150 from
			acc1 and displays the message “WITHDRAWAL SUCCESSFUL” if the
			amount was withdrawn successfully and “INSUFFICIENT FUNDS” if it
			was not.*/
		boolean ok;
		ok = acct1.withdraw(150); // return the value of withdrawal method
		if(ok)
		{
			System.out.println("WITHDRAWAL SUCCESSFUL");
		}
		else
		{
			System.out.println("INSUFFICIENT FUNDS");
		}
		
		// (d) Write a line of code that will display the balance of acc1.
		System.out.println("Balance for Account 1: " + acct1.getBalance());
		
		// (3) Write a line of code that will display the balance of acc2.
		System.out.println("Balance for Account 2: " + acct2.getBalance());
	}	

}
