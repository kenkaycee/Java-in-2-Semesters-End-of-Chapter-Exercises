/* * 6. Design and implement a program that allows the user to enter into an array the
price of 5 products in pounds sterling. The program should then copy this array
into another array but convert the price of each product from pounds sterling to
US dollars. The program should allow the user to enter the exchange rate of
pounds to dollars, and should, when it terminates, display the contents of both
arrays. Once again, make use of methods in your program to carry out these

 * 7. Amend the program in Exercise 6 above so that
(a) the user is asked how many items they wish to purchase and the arrays are
then sized accordingly;
(b) the total cost of the order is displayed in both currencies.
 */
import java.text.DecimalFormat;
import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] productPricePounds; 
		double[] productPriceDollars; // declare array
		int itemSize;
		// ask user how many items they want to purchase
		System.out.print("How many items do you want to purchase?: ");
		itemSize = sc.nextInt();
		
		productPricePounds = new double[itemSize];
		productPriceDollars = new double[itemSize];
		productPriceInPounds(productPricePounds); // call method to enter price in pounds
		double rate; // pounds-dollars exchange rate
		System.out.print("Enter exchange rate of pounds to dollars: ");	
		rate = sc.nextDouble();
		displayPrice(productPricePounds, productPriceDollars, rate); // call method that converts price to dollars and display both prices
		productPriceDollars = productPriceInDollars(productPricePounds, rate);
		totalCostInPounds(productPricePounds);
		totalCostInDollars(productPriceDollars);
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
	
	// method that accept array of prices in pounds and convert it to array of dollars prices
	static double[] productPriceInDollars(double[] productIn, double rateIn) {
		System.out.println();
		double [] productCopy = productIn.clone(); // copy the pound prices
		for(int i = 0; i < productCopy.length; i++)
		{
			productCopy[i] = productCopy[i] * rateIn; // multiply the pound prices with the dollar exchnage rate
		}
		return productCopy; // returns dollar prices
	}
	
	// method that copy an array, convert exchange rate, store the new price in the array and display both arrays
	static void displayPrice(double[]productIn, double[] productCopyIn, double rateIn) {
		Scanner sc = new Scanner(System.in);
		productCopyIn = productIn.clone(); // copy array 
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
	
	// method to display total cost of orders in pounds
	static void totalCostInPounds(double[] productIn) {
		double total = 0;
		for(double item: productIn)
		{
			total = total + item;
		}
		// print total cost 
		System.out.println("Total Cost in Pounds: " + total);
	}
	
	// method to display total cost of orders in dollars
		static void totalCostInDollars(double[] productCopyIn) {
			double total = 0;
			for(double item: productCopyIn)
			{
				total = total + item;
			}
			// print total cost 
			System.out.println("Total Cost in dollars: " + total);
		}
	
}











