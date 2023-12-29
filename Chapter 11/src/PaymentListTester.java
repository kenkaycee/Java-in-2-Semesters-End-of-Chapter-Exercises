
public class PaymentListTester {
	
	public static void main(String[] args) {
		int choice, size;
		PaymentList list;
		System.out.print("Size of list: ");
		size = EasyScanner.nextInt();
		list = new PaymentList(size);
		do 
		{
			System.out.println();
			System.out.println("1. ADD PAYMENT");
			System.out.println("2. DISPLAY PAYMENTS");
			System.out.println("3. IS FULL");
			System.out.println("4. GET PAYMENT");
			System.out.println("5. GET TOTAL");
			System.out.println("6. CALCULATE TOTAL PAID");
			System.out.println("7. QUIT");
			System.out.println();
			System.out.print("Enter a choice [1 - 7]: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			switch(choice)
			{
			case 1: option1(list);break;
			case 2: option2(list);break;
			case 3: option3(list);break;
			case 4: option4(list);break;
			case 5: option5(list);break;
			case 6: option6(list);break;
			case 7: break;
			default: System.out.print("Choice 1-7 only!");
			}
		}while(choice != 7);
	}
	// ADD PAYMENT
	static void option1(PaymentList listIn) {
		// prompt for payment details 
		System.out.print("Enter month: ");
		String month = EasyScanner.nextString();
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
		month = month.substring(0, 3);
		System.out.print("Enter amount: ");
		double amount = EasyScanner.nextDouble();
		while(amount < 0) // validate that payment is positive
		{
			System.out.println("ERROR: No negative payment");
			amount = EasyScanner.nextDouble();
		}
		// create new Payment object 
		Payment p = new Payment(month, amount);
		// add payment to the list 
		int add = listIn.addPay(month, amount);
		if(add == 1)
		{
			listIn.addPayment(p);
			System.out.println("Payment added");
		}
		else if( add == -1)
		{
			System.out.println("ERROR: List is full");
		}
		else if(add == -2)
		{
			System.out.println("Payment already made for this month");
		}
		else if(add == -3)
		{
			System.out.println("Payment already made for this month and the List is full");
		}
				
	}
	
	// DISPLAY
	static void option2(PaymentList listIn) {
		System.out.println("ITEM ENTERED");
		System.out.println(listIn); // calls to toString method of PaymentList
	}
	
	// IS FULL
	static void option3(PaymentList listIn) {
		if(listIn.isFull())
		{
			System.out.println("List is full");
		}
		else
		{
			System.out.println("List is NOT full");
		}
	}
	
	// GET PAYMENT
	static void option4(PaymentList listIn) {
		// prompt for and receive payment number 
		System.out.print("ENter payment number to receive: ");
		int number = EasyScanner.nextInt();
		// retrieve payment object from list 
		Payment p = listIn.getPayment(number); // returns null if invalid position
		if(p != null)
		{
			System.out.println(p);
		}
		else
		{
			System.out.println("Invalid payment number");
		}
	}	
	
	// GET Total
	static void option5(PaymentList listIn) {
		System.out.print("Total number of payments entered: ");
		System.out.println(listIn.getTotal());
	}
	// GET TOTAL Payment
		static void option6(PaymentList listIn) {
			System.out.print("Total number of payments made so far: ");
			System.out.println(listIn.calculateTotalPaid());
		}
}












