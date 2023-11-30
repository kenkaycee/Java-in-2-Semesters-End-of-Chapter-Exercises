import java.util.ArrayList;

// this class contains many vehicle objects and allows us to perform specific operations 

public class VehicleApp {
	// attribute 
	private ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	// methods 
	
	/*-search(String) : int
	This is what we can term a helper method; it will be declared as private (note
	the minus sign in the UML notation), because it is not intended for it to be called by
	other classes. It accepts a String representing Registration Number. It then returns
	the index of the vehicle with that reg number in the ArrayList. If the
	reg number does not exist, then a “phoney” index (−999) will be returned to
	indicate failure.*/
	
	public int search(String regNoIn) {
		for(int i = 0; i <= vehicleList.size()-1; i++)
		{
			Vehicle tempVehicle = vehicleList.get(i);
			String tempRegNo = tempVehicle.getRegNo();
			if(tempRegNo.equals(regNoIn))
			{
				return i; // return the index 
			}
		}
		return -999; 
	}
	
	/* +getTotal(): int
	 * returns the total number of vehicle currently in the system */
	public int getTotal() {
		return vehicleList.size();
	}
	
	/* +getVehicle(String): Vehicle
	 * This method receives a String representing an reg number, and returns the vehicle with that reg number. If the reg number is not valid, a null value will be returned.
	 */
	public Vehicle getVehicle(String regNoIn) {
		int index = search(regNoIn);
		if(index != -999) // check that vehicle exits
		{
			return vehicleList.get(index);
		}
		else
		{
			return null; // no such vehicle 
		}
	}
	
	/*+addVehicle(String, String, int, double): boolean
	 * This method receives two strings representing the reg number and make respectively, one int representing the year the vehicle was manufactured and one double representing the value of the vehicle. It adds a vehicle with these details to the list of vehicles. If a
	vehicle with this reg number already exists, the new vehicle will not be added and the method will return a value of false. However, if the operation has been completed
	successfully a value of true is returned.
	 * */
	
	public boolean addVehicle(String regNoIn, String makeIn, int yearOfManufactureIn, double valueIn) {
		if(search(regNoIn) == -999) // check that vehicle does not already exist
		{
			vehicleList.add(new Vehicle(regNoIn, makeIn, yearOfManufactureIn, valueIn));
			return true; // indicate success 
		}
		else
		{
			return false; //indicate failure 
		}
	}
	
	/* +removeVehicle(String) : boolean
	Accepts a String, representing a reg number, and removes that vehicle from the list. Returns true if the vehicle was removed successfully, or false otherwise (no such reg number).
	 */
	public boolean removeVehicle(String regNoIn) {
		int index = search(regNoIn); // find the index of a vehicle 
		if(index != -999) // check that vehicle exists 
		{
			vehicleList.remove(index); 
			return true; // remove was successful
		}
		else
		{
			return false; // remove was not successful 
		}
	}
	
	/* +displayallVehicles(Vehicle)
	 * This method accept vehicle object and display the details of all the vehicle in the list 
	 * */
	 public void displayAllVehicles() {
		 for(Vehicle item : vehicleList)
		 {
			 System.out.println("Reg Number: " + item.getRegNo());
             System.out.println("Make: " + item.getMake());
             System.out.println("Year of Manufacture: " + item.getYearOfManufacture());
             System.out.println("Value: " + item.getValue());
             System.out.println();
		 }
	 }	
}











