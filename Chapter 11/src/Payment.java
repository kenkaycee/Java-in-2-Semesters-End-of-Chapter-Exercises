/** Class used to store details of a single payment in a hostel
 * @author Kaycee Ezenta
 * @version 30th November 2023
 */
public class Payment {
	// attributes
	private String month;
	private double amount;
	
	/** Constructor that sets the month and amount paid
	 * @param monthIn: the month of the year
	 * @param amountIn: the amount paid for the month
	 */
	public Payment(String monthIn, double amountIn) {
		month = monthIn;
		amount = amountIn;
	}
	
	/** Reads the month for which payment was made
	 * @return Returns the month for which payment was made
	 */
	public String getMonth() {
		return month;
	}
	
	/** Reads the amount paid for the month
	 * @return Returns the amount paid for the month
	 */
	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "(" + month + ": " + amount + ")";
	}

}
