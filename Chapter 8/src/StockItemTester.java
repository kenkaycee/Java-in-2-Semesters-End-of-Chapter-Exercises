/*
 * (b) Consider the following program, which uses the StockItem class, and
in which some of the code has been replaced by comments:
 */

import java.util.*;
public class StockItemTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		String tempNumber;
		String tempName;
		double tempPrice;
		
		System.out.print("Enter the stock number: ");
		tempNumber = scString.nextLine();
		System.out.print("Enter the name of the item: ");
		tempName = scString.nextLine();
		System.out.print("Enter the price of the item: ");
		tempPrice = sc.nextDouble();
		
		// Create a new item of stock using the values that were entered by the user
		StockItem item1 = new StockItem(tempNumber, tempName, tempPrice);
		
		// Increase the total number of items in stock by 5
		item1.increaseTotalStock(5);
		
		// Display the stock number
		System.out.println("Stock Number: " + item1.getStockNumber());
		
		// Display the total price of all items in stock
		System.out.println("Total Price: " + item1.calculateTotalPrice());
		
		// iii. Write a line of code that sets the sales tax for all objects of the class to 10 without referring to any particular object.
		StockItem.setSalesTax(10);
		System.out.println("Sales Tax: " + StockItem.getSalesTax());
	}

}
