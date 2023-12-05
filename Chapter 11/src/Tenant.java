
/** Class used to record the details of a tenant
 * @author Kaycee Ezenta
 * @version 25th November 2023
 */
public class Tenant {
	// attributes 
	private String name;
	private int room;
	private PaymentList payments;
	public static final int MAX = 12;
	
	/** Constructor that initialises the name and room number of the tenant and sets the payments made to empty list
	 * @param nameIn: name of the tenant
	 * @param roomIn: room number of the tenant
	 */
	public Tenant(String nameIn, int roomIn) {
		payments = new PaymentList(MAX);
		name = nameIn;
		room = roomIn;
	}
	
	/** Record a payment for the tenant	 * 
	 * @param payIn: payment made by the tenant
	 */
	public void makePayment(Payment payIn) {
		payments.addPayment(payIn); // call PaymentList method
		
	}
	
	/** Reads name of the tenant	 * 
	 * @return Returns the name of the tenant
	 */
	public String getName() {
		return name;
	}
	
	/** Reads the room number of the tenant
	 * @return Returns the room number of the tenant
	 */
	public int getRoom() {
		return room;
	}
	
	/** Reads the payment of the tenant
	 * @return Returns the payments made by the tenant 
	 */
	public PaymentList getPayments() {
		return payments;
	}
	
	@Override
	public String toString() {
		return name + ", " + room + ", " + payments;
	}
}
