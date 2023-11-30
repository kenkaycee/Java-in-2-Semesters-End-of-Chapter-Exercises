// Testing the Vehicle Application

public class VehicleAppTester {

	public static void main(String[] args) {
		int choice;
		VehicleApp myVehicle = new VehicleApp();
		
		// offer menu
		do 
		{
			System.out.println();
            System.out.println("1. Add a vehicle");
            System.out.println("2. Delete a vehicle");
            System.out.println("3. Display a particular vehicle details");
            System.out.println("4. Display all the vehicles in the list");
            System.out.println("5. Display the total vehicles in the list");
            System.out.println("6. Quit");

            // get choice
            choice = EasyScanner.nextInt();
            System.out.println();

            // process menu options
            switch(choice)
            {
                case 1: option1(myVehicle); break;
                case 2: option2(myVehicle); break;
                case 3: option3(myVehicle); break;
                case 4: option4(myVehicle); break;
                case 5: option5(myVehicle); break;
                case 6: break;
                default: System.out.println("Choice 1 - 4 only");
            }
		}while(choice != 6);
	}
	
	// add vehicle
	public static void option1(VehicleApp vehicleIn) {
		// get details of vehicle to be added 
		System.out.print("Enter Reg Number: ");
		String regNo = EasyScanner.nextString();
		System.out.print("Enter Manufacturer: ");
		String make = EasyScanner.nextString();
		System.out.print("Enter year manaufactured: ");
		int year = EasyScanner.nextInt();
		System.out.print("Enter Price: ");
		double price = EasyScanner.nextDouble();
		// add account to the list
		boolean success = vehicleIn.addVehicle(regNo, make, year, price);
		if(success)
		{
			System.out.println("Vehice added");
		}
		else
		{
			System.out.println("Vehicle already exists");
		}
	}
	
	// remove vehicle 
	public static void option2(VehicleApp vehicleIn) {
		// get the reg number of vehicle to remove
		System.out.print("Enter Reg Number: ");
		String regNo = EasyScanner.nextString();
		// delete item if it exists
		boolean found = vehicleIn.removeVehicle(regNo);
		if(found)
		{
			System.out.println("Vehicle removed");
		}
		else
		{
			System.out.println("No such vehicle registration number");
		}
	}
	
	// display a vehicle details 
	public static void option3(VehicleApp vehicleIn) {
		// get the reg number of the vehicle 
		System.out.print("Enter Reg Number: ");
		String regNo = EasyScanner.nextString();
		// print the details if it exists 
		Vehicle veh = vehicleIn.getVehicle(regNo);
		if(veh != null)
		{
			System.out.println("Reg Number: " + veh.getRegNo());
            System.out.println("Make: " + veh.getMake());
            System.out.println("Year of Manufacture: " + veh.getYearOfManufacture());
            System.out.println("Value: " + veh.getValue());
		}
		else
		{
			System.out.println("No such vehicle");
		}
	}
	
	// display all the vehicles 
	public static void option4(VehicleApp vehicleIn) {
		// check that there is vehicle in the list
		if(vehicleIn.getTotal() < 1)
		{
			System.out.println("No vehicle in the list");
		}
		else
		{
			vehicleIn.displayAllVehicles();
		}
	}
	
	// total number of vehicles 
	public static void option5(VehicleApp vehicleIn) {
		System.out.println("Total number of vehicles: " + vehicleIn.getTotal());
	}
	
}
