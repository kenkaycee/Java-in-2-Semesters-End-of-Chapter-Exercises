import java.util.ArrayList;

/** Collection class that holds a list of payments
 * @author Kaycee Ezenta
 * @version 30th November 2023
  */
public class PaymentList {
	// attributes 
	private ArrayList<Payment> pList;
	public final int MAX;
	
	/** Constructor that initialises an empty Payment list and sets the maximum size of the list
	 * @param maxIn: The maximum size of the list 
	 */
	public PaymentList(int maxIn) {
		MAX = maxIn;
		pList = new ArrayList<>();
	}
	
	/** Gets the total number of payments
	 * @return Returns the total number of payments currently in the system
	 */
	public int getTotal() {
		return pList.size();
	}
	
	/** Check if the list is full
	 * @return Returns true if the list is full and false otherwise
	 */
	public boolean isFull() {
		return pList.size() == MAX;
	}
	
	/** Reads the payment at the given logical position
	 * @param positionIn: The logical position of the payment in the list
	 * @return Returns the payment at the given logical position or null if no payment at the given logical position
	 */
	public Payment getPayment(int positionIn) {
		if(positionIn < 1 || positionIn > getTotal())
		{
			return null; // no payment object at the given logical position
		}
		else
		{
			return pList.get(positionIn - 1); // take one off the logical position to get the ArrayList position
		}
	}
	
	/** Add a new payment to the end of the list
	 * @param paymentIn: The Payment to be added
	 * @return Returns true if payment added and false otherwise
	 */
	public boolean addPayment(Payment paymentIn) {
		if(!isFull())
		{
			pList.add(paymentIn);
			return true; // payment added
		}
		else
		{
			return false; // payment not added 
		}
	}
	
	
	/** Gets the index of a specified Payment month in the Payment list
	 * @param monthIn: The month of the specified Payment object
	 * @return Returns the index of the Payment with the specified month or -999 (phoney index) if the month is not in the Payment list
	 */
	public int search(String monthIn) {
		for(int i = 0; i < pList.size(); i++)
		{
			Payment tempPayment = pList.get(i);
			String tempMonth = tempPayment.getMonth();
			if(tempMonth.equals(monthIn))
			{
				return i;
			}
		}
		return -999;
	}
	
	/** Adds payment if the month is not already added
	 * @param monthIn: the month for which the payment is made
	 * @param amountIn: the amount of the payment for the month
	 * @return Returns 1 if payment is added or -1 if the list is full or -2 if payment is already made for the month
	 * or -3 if payment is already made for the month and list is full
	 */
	public int addPay(String monthIn, double amountIn) {
		if(search(monthIn) == -999)
		{
			if((search(monthIn) == -999) && !isFull())
			{
				return 1; // added successfully
			}
			else if((search(monthIn) == -999) && isFull())
			{
				return -1; // failure because list is full
			}
		}
		else 
		{
			if(search(monthIn) != -999)
			return -2; // indicate failure because payment made already for month
			
			else if(search(monthIn) != -999 && isFull())
			{
				return -3; // payment made for month already and list is full
			}
		}
		
		return 0;
	}
	
	/**Calculates the total payments made by the tenant
	 * @return Returns the total value of the payment recorded
	 */
	public double calculateTotalPaid() {
		double totalPaid = 0;
		// loop through all payments
		for(Payment currentPayment: pList)
		{
			totalPaid = totalPaid + currentPayment.getAmount(); // add current payment to the running total
		}
		return totalPaid;
	}
	
	@Override
	public String toString() {
		return pList.toString();
	}
}







