/*
 * 4. (a) Design and implement a program that converts a sum of money to a different
currency. The amount of money to be converted, and the exchange rate, are
entered by the user. The program should have separate methods for:
• obtaining the sum of money from the user;
• obtaining the exchange rate from the user;
• making the conversion;
• displaying the result

(b) Adapt the above program so that after the result is displayed the user is asked
if he or she wishes to convert another sum of money. The program continues
in this way until the user chooses to quit.
 */
import java.util.*;
public class Exercise4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amount, rate, convertRate;
		char response;
		do
		{
			System.out.println();
			System.out.println("***Pounds to Dollars Conversion***");
			amount = amountToConvert(); // call method
			rate = exchangeRate(); // call method 
			convertRate = poundsToDollars(amount, rate); // call method
			displayResult(convertRate); // call method
			System.out.print("Do you want to convert another money (y/n)? ");
			response = sc.next().charAt(0);
		}while(response == 'Y' || response == 'y');
		
	}
	
	// gets the user to enter the amount of pounds they want to convert
	static double amountToConvert() {
		//double amountIn; // local variable
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of pounds you want to convert: ");
		double amountIn = sc.nextDouble();
		return amountIn;
	}
	
	// gets the user to enter the exchange rate
	static double exchangeRate( ) {
		//double rateIn; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the exchange rate: ");
		double rateIn = sc.nextDouble();
		return rateIn;
	}
	
	// calculates the conversion to dollars
	static double poundsToDollars(double amountIn, double rateIn) {
		double convertedRateIn = amountIn * rateIn;
		return convertedRateIn;
	}
	
	// display the result of the conversion
	static void displayResult(double convertedRateIn) {
		System.out.println("Amount in dollars: " + convertedRateIn);
	}
}
