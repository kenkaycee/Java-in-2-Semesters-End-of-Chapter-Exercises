/*
 * 6. Design and implement a program that allows the user to enter into an array the
price of 5 products in pounds sterling. The program should then copy this array
into another array but convert the price of each product from pounds sterling to
US dollars. The program should allow the user to enter the exchange rate of
pounds to dollars, and should, when it terminates, display the contents of both
arrays. Once again, make use of methods in your program to carry out these
tasks.
 */
import java.text.DecimalFormat;
import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		double[] productPrice = new double[5]; // declare array
		productPriceInPounds(productPrice); // call method to enter price in pounds
		displayPrice(productPrice); // call method that converts price to dollars and display both prices
		
	}
	
	// method to enter price of product in pounds sterling
	static double[] productPriceInPounds(double[] productIn) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****PRODUCT PRICES IN POUND STERLINGS****");
		System.out.println();
		for(int i = 0; i < productIn.length; i++)
		{
			System.out.print("Product " + (i + 1) + ": " );
			productIn[i] = sc.nextDouble();
		}
		return productIn;
	}
	
	// method that copy an array, convert exchange rate, store the new price in the array and display both arrays
	static void displayPrice(double[]productIn) {
		Scanner sc = new Scanner(System.in);
		double[]productCopyIn = productIn.clone(); // copy array 
		double rateIn; // pounds-dollars exchange rate
		System.out.print("Enter exchange rate of pounds to dollars: ");	
		rateIn = sc.nextDouble();
		System.out.println();
		System.out.println("***PRICE OF PRODUCTS IN DOLLARS****");
		System.out.println();
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		for(int i = 0; i < productCopyIn.length; i++)
		{
			// multiply prices in array by the exchange rate
			productCopyIn[i] = (productCopyIn[i] * rateIn);
		}
		
		// print the original product price in pounds
		System.out.println("***PRODUCT PRICE IN STERLING POUNDS****");
		for(int i = 0; i < productIn.length; i++)
		{
			System.out.println("Product " + (i + 1) + ": " + productIn[i]);
		}
		System.out.println();
		// print the  product price in dollars
		System.out.println("***PRODUCT PRICE IN DOLLARS(Exchange Rate: "+ rateIn + ")****");
		for(int i = 0; i < productCopyIn.length; i++)
		{
			System.out.println("Product " + (i + 1) + ": " + df.format(productCopyIn[i]));
		}
	}
}











