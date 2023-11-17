/*
 * 8. Consider a bank that offers four different types of account (‘A’, ‘B’, ‘C’
and ‘X’). The following table illustrates the annual rate of interest offered for
each type of account.
Design and implement a program that allows the user to enter an amount of
money and a type of bank account, before displaying the amount of money that

Account Annual rate of interest (%)
A 1.5
B 2
C 1.5
X 5
Design and implement a program that allows the user to enter an amount of
money and a type of bank account, before displaying the amount of money that
can be earned in one year as interest on that money for the given type of bank
account. You should use the switch statement when implementing this program.
Hint: be careful to consider the case of the letters representing the bank
accounts. You might want to restrict this to, say, just upper case. Or you could
enhance your program by allowing the user to enter either lower case or upper
case letters.

 */

import java.util.*;
public class BankInterest {

	public static void main(String[] args) {
		// declare variables
		double amount, interestRate, incomeEarned;
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
			interestRate = 1.5;
			incomeEarned = interestRate * amount;
			System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
			incomeEarned);
			break;
		case 'B': 
			interestRate = 2;
			incomeEarned = interestRate * amount;
			System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
					incomeEarned);
			break;
		case 'X':
			interestRate = 5;
			incomeEarned = interestRate * amount;
			System.out.println("Yearly interest income for an interest rate of " + interestRate + "% for an investment of $" + amount + " in Bank Account Type " + bankAccount + " is: $" +
					incomeEarned);
			break;
		default:
			System.out.println("No such bank account. Choose from options A, B, C, X only!!!");
		}
				
	}

}
