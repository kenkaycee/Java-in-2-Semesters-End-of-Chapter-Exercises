/*
 * The class shown below keeps track of a pressure sensor in a laboratory.
When a Sensor object is created using the first constructor, the initial pressure
is set to zero. When it is created using the second constructor it is set to the value
of the parameter.
The pressure should not be set to a value less than zero. Therefore, if the input
parameter to the setPressure method is a negative number, the pressure
should not be changed and a value of false should be returned. If the pressure
is set successfully, a value of true should be returned.
(a) Write the code for the Sensor class.
 */

public class Sensor {
	// attributes 
	private double pressure;
	
	// constructors
	public Sensor() {
		pressure = 0;
	}
	
	public Sensor(double pressureIn) {
		pressure = pressureIn;
	}
	
	// methods 
	// set pressure 
	public boolean setPressure(double pressureIn) {
		if(pressureIn >= 0)
		{
			pressure = pressureIn;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// get pressure 
	public double getPressure() {
		return pressure;
	}
}












