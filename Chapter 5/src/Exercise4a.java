/*
 * 4. (a) Design and implement a program that converts a sum of money to a different
currency. The amount of money to be converted, and the exchange rate, are
entered by the user. The program should have separate methods for:
• obtaining the sum of money from the user;
• obtaining the exchange rate from the user;
• making the conversion;
• displaying the result
 */
import java.util.*;
public class Exercise4a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amount, rate, convertRate;
		System.out.println("***Pounds to Dollars Conversion***");
		amount = amountToConvert(); // call method
		rate = exchangeRate(); // call method 
		convertRate = poundsToDollars(amount, rate); // call method
		displayResult(convertRate); // call method
	}
	
	// gets the user to enter the sum of money they want to convert
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
	
	// calculates the conversion 
	static double poundsToDollars(double amountIn, double rateIn) {
		double convertedRateIn = amountIn * rateIn;
		return convertedRateIn;
	}
	
	// display the result of the conversion
	static void displayResult(double convertedRateIn) {
		System.out.println("Amount in dollars: " + convertedRateIn);
	}
}
