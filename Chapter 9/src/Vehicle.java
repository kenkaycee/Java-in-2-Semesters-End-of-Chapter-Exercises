/*
 * 3. (a) Implement the Vehicle and the SecondHandVehicle classes of
self-test question 1.
You should note that:
• the calculateAge method of Vehicle accepts an integer representing the current year, and returns the age of the vehicle as calculated
by subtracting the year of manufacture from the current year;

 */

public class Vehicle {
	// attributes 
	private String regNo;
	private String make;
	private int yearOfManufacture;
	private double value;
	
	// constructor 
	public Vehicle(String regNoIn, String makeIn, int yearOfManufactureIn, double valueIn) {
		regNo = regNoIn;
		make = makeIn;
		yearOfManufacture = yearOfManufactureIn;
		value = valueIn;
	}
	
	// methods 
	public String getRegNo() {
		return regNo;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double valueIn) {
		value = valueIn;
	}
	
	/*the calculateAge method of Vehicle accepts an integer representing the current year, and returns the age of the vehicle as calculated
by subtracting the year of manufacture from the current year;*/
	
	public int calculateAge(int currentYearIn) {
		return currentYearIn - yearOfManufacture;
	}
}












