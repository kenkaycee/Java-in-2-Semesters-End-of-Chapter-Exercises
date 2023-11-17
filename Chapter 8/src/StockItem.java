/*
 * 3. A system is being developed for use in a store that sells electrical appliances.
A class called StockItem is required for this system. An object of the
StockItem class will require the following attributes:
• a stock number;
• a name;
• the price of the item;
• the total number of these items currently in stock.
The first three of the above attributes will need to be set at the time a
StockItem object is created—the total number of items in stock will be set to
zero at this time. The stock number and name will not need to be changed after
the item is created.
8.11 Programming Exercises 227
The following methods are also required:
• a method that allows the price to be re-set during the object’s lifetime;
• a method that receives an integer and adds this to the total number of items
of this type in stock;
• a method that returns the total value of items of this type in stock; this is
calculated by multiplying the price of the item by the number of items in
stock;
• methods to read the values of all four attributes.
 */

/*
 * (c) i. A further attribute, salesTax, is required. The value of this attribute
should always be the same for each object of the class. Write the declaration for this attribute.
 */
public class StockItem {
	// attributes 
	private String stockNumber;
	private String stockName;
	private double stockPrice; 
	private int totalStock;
	private static double salesTax;
	
	// constructor 
	public StockItem(String stockNumberIn, String stockNameIn, double stockPriceIn) {
		stockNumber = stockNumberIn;
		stockName = stockNameIn;
		stockPrice = stockPriceIn;
		totalStock = 0;
	}
	
	// methods 
	// set price 
	public void setPrice(double stockPriceIn) {
		stockPrice = stockPriceIn;
	}
	
	// increase total number of stock items
	public void increaseTotalStock(int stockItemIn) {
		totalStock = totalStock + stockItemIn;
	}
	
	// get stock number
	public String getStockNumber() {
		return stockNumber;
	}
	
	// get stock name 
	public String getStockName() {
		return stockName;
	}
	
	// get price 
	public double getPrice() {
		return stockPrice;
	}
	
	// get total stock 
	public int getTotalStock() {
		return totalStock;
	}
	
	// calculate total price of stock items 
	public double calculateTotalPrice() {
		return (totalStock * stockPrice);
	}
	
	/*ii. Provide a class method, setSalesTax, for this class—it should receive a double and set the value of the sales tax to this value.*/
	public static void setSalesTax(double salesTaxIn) {
		salesTax = salesTaxIn;
	}
	
	// get sales tax
	public static double getSalesTax() {
		return salesTax;
	}
}


















