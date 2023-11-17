
public class ApartmentTester {

	public static void main(String[] args) {
		int choice;
		Apartment myApartment = new Apartment();
		
		// offer menu
		do
		{
			System.out.println();
			System.out.println("1. Add room");
			System.out.println("2. Get area of room");
			System.out.println("3. Get length of room");
			System.out.println("4. Get height of room");
			System.out.println("5. Total rooms in the apartment");
			System.out.println("6. Quit");
			System.out.println();
			System.out.print("Enter choice [1 - 6]: ");
			
			// get choice 
			choice = EasyScanner.nextInt();
			System.out.println();
			switch(choice)
			{
			case 1: option1(myApartment);break;
			case 2: option2(myApartment);break;
			case 3: option3(myApartment);break;
			case 4: option4(myApartment);break;
			case 5: option5(myApartment);break;
			case 6: break;
			default : System.out.println("Invalid choice. Enter 1 -5 only: ");
			}
		}while(choice != 6);
	}
	
	static void option1(Apartment apartmentIn) {
		// get room dimensions from user 
		System.out.print("Enter room length: ");
		double length = EasyScanner.nextDouble();
		System.out.print("Enter room height: ");
		double height = EasyScanner.nextDouble();
		boolean success = apartmentIn.addRoom(length, height);
		if(success)
		{
			System.out.println("Room added");
		}		
	}
	
	// get area of a particular room
	static void option2( Apartment apartmentIn) {
		System.out.print("Enter room number: ");
		int number = EasyScanner.nextInt();
		if(number == -999 || number < 1 || number > apartmentIn.getTotal())
		{
			System.out.println("Room does not exist");
		}
		else
		{
			double area = apartmentIn.getRoomArea(number);
			System.out.println("Room " + number + " Area: " + area);
		}
		
	}
	
	// get length 
	static void option3( Apartment apartmentIn) {
		System.out.print("Enter room number: ");
		int number = EasyScanner.nextInt();
		if(number == -999 || number < 1 || number > apartmentIn.getTotal())
		{
			System.out.println("Room does not exist");
		}
		else
		{
			double length = apartmentIn.getRoomLength(number);
			System.out.println("Room " + number + " Length: " + length);
		}		
	}
	// get height 
	static void option4( Apartment apartmentIn) {
		System.out.print("Enter room number: ");
		int number = EasyScanner.nextInt();
		if(number == -999 || number < 1 || number > apartmentIn.getTotal())
		{
			System.out.println("Room does not exist");
		}
		else
		{
			double height = apartmentIn.getRoomLength(number);
			System.out.println("Room " + number + " Length: " + height);
		}		
	}

	// total room in apartment
	static void option5(Apartment apartmentIn){
		System.out.println("Total room in the apartment: " + apartmentIn.getTotal());
	}

}
