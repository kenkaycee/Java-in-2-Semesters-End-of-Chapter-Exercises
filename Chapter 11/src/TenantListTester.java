import java.util.ArrayList;

public class TenantListTester {

	public static void main(String[] args) {
		TenantList list;
		int choice, size;
		System.out.print("Size of list: ");
		size = EasyScanner.nextInt();
		list = new TenantList(size);
		
		// offer menu options
		do
		{
			System.out.println("1. Add tenant");
			System.out.println("2. Remove tenant");
			System.out.println("3. Display");
			System.out.println("4. Get tenant");
			System.out.println("5. Check is full");
			System.out.println("6. Check is empty");
			System.out.println("7. Get Total");
			System.out.println("8. Quit");
			System.out.println();
			System.out.print("Enter choice 1 - 8: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			
			// process menu
			switch(choice)
			{
			case 1: option1(list);break;
			case 2: option2(list);break;
			case 3: option3(list);break;
			case 4: option4(list);break;
			case 5: option5(list);break;
			case 6: option6(list);break;
			case 7: option7(list);break;
			case 8: break;
			default: System.out.println("INVALID CHOICE. Enter 1 - 8 only!");
			}
		}while(choice != 8);
		Tenant t = new Tenant("Kay", 100);
		Payment p = new Payment("Jan", 15660);
		t.makePayment(p);
		list.addTenant(t);
		System.out.println(t);

	}
	
	//ADD
	static void option1(TenantList listIn) {
		System.out.print("Enter name to add: ");
		String name = EasyScanner.nextString();
		System.out.print("Enter room number: ");
		int room = EasyScanner.nextInt();
		// create Tenant object 
		Tenant t = new Tenant(name, room);
		boolean ok = listIn.addTenant(t);
		if(ok)
		{
			System.out.println("Tenant added");
		}
		else
		{
			System.out.println("ERROR - list full");
		}		
		
	}
	
	//REMOVE
	static void option2(TenantList listIn) {
		System.out.print("Enter room number you want to remove: ");
		int room = EasyScanner.nextInt();
		boolean ok = listIn.removeTenant(room);
		if(ok)
		{
			System.out.println("Tenant removed");
		}
		else
		{
			System.out.println("ERROR - No tenant in the room");
		}
	}
	
	// DISPLAY
	static void option3(TenantList listIn) {
		System.out.println("ITEMS ENTERED");
		System.out.println(listIn);
	}
	
	// GET TENANT
	static void option4(TenantList listIn) {
		System.out.print("Enter room number to retrieve: ");
		int room = EasyScanner.nextInt();
		Tenant t = listIn.getTenant(room);
		if(t != null)
		{
			System.out.println(t);
		}
		else
		{
			System.out.println("Invalid Room Number");
		}
	}
	
	// IS FULL
	static void option5(TenantList listIn) {
		if(listIn.isFull())
		{
			System.out.println("List is full");
		}
		else
		{
			System.out.println("List is NOT full");
		}
	}
	
	// IS EMPTY
	static void option6(TenantList listIn) {
		if(listIn.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is NOT empty");
		}
	}
	
	// GET TOTAL
	static void option7(TenantList listIn) {
		System.out.println(listIn.getTotal());
	}
	
}
