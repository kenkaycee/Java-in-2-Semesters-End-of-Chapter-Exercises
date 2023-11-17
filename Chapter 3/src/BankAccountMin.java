import java.util.Scanner;

/*
 * Consider the bank accounts discussed in Exercise 8 again. Now assume that
each type of bank account is associated with a minimum balance as given in the
table below:
Account Minimum balance
A 250
B 1000
C 250
X 5000
Adapt the switch statement of the program in Exercise 8 above so that the
interest is applied only if the amount of money entered satisfies the minimum
balance requirement for the given account. If the amount of money is below the
minimum balance for the given account an error message should be displayed.

 */
import java.util.*;
public class BankAccountMin {

	public static void main(String[] args) {
		// declare variables
		double amount, interestRate, incomeEarned, minBalance;
		char bankAccount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount you want to invest: ");
		amount = sc.nextDouble();
		System.out.println("Enter Account type [Choose from options: A, B, C, X]: ");
		bankAccount = sc.next().charAt(0);
		bankAccount = Character.toUpperCase(bankAccount); // converts to upper case
		switch(bankAccount)
		{
		case 'A': case 'C': // same interest rates
			minBalance = 250;
			interestRate = 1.5;
			incomeEarned = interestRate * amount;
			if(amount >= minBalance) // check amount deposited is equals to or greater than minimum balance required
			{
				System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
						incomeEarned); // Satisfies minimum amount required
			}
			else
			{
				System.out.println("Amount is below $" + minBalance + " which is the minimum balance required. Please deposit at least the minimum amount" );
			}
			
			break;
		case 'B': 
			minBalance = 1000;
			interestRate = 2;
			incomeEarned = interestRate * amount;
			if(amount >= minBalance) // check amount deposited is equals to or greater than minimum balance required
			{
				System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
						incomeEarned); // Satisfies minimum amount required
			}
			else
			{
				System.out.println("Amount is below $" + minBalance + " which is the minimum balance required. Please deposit at least the minimum amount" );
			}
			break;
		case 'X':
			minBalance = 5000;
			interestRate = 5;
			incomeEarned = interestRate * amount;
			if(amount >= minBalance) // check amount deposited is equals to or greater than minimum balance required
			{
				System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
						incomeEarned); // Satisfies minimum amount required
			}
			else
			{
				System.out.println("Amount is below $" + minBalance + " which is the minimum balance required. Please deposit at least the minimum amount" );
			}
			break;
		default:
			System.out.println("No such bank account. Choose from options A, B, C, X only!!!");
		}
				
	}

}