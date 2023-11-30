// subclass of Vehicle class 
public class SecondHandVehicle extends Vehicle{
	// attributes 
	private int numberOfOWners;
	
	// constructor 
	public SecondHandVehicle(String regNoIn, String makeIn, int yearOfManufactureIn, double valueIn, int numberOfOwnersIn) {
			super(regNoIn, makeIn, yearOfManufactureIn, valueIn);
			numberOfOWners = numberOfOwnersIn;
		}
	
	// methods 
	public int getNumberOfOwners() {
		return numberOfOWners;
	}
	
	/*• the hasMultipleOwners method of SecondHandVehicle should return true if the numberOfOwners attribute has a value greater than 1, or false otherwise.*/
	public boolean hasMultipleOwners() {
		if(numberOfOWners > 1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
