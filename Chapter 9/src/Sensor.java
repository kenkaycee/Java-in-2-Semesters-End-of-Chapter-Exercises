/*
 * 3. Consider once again an application to record the reading of a pressure sensor as
discussed in programming exercise 4 of the previous chapter. 
 */
public class Sensor {
	// attributes 
	protected double pressure;
	
	// constructors
	public Sensor() {
		pressure = 0; // set initial pressure to zero when Sensor object is created using this constructor
	}
	
	public Sensor(double pressureIn) {
		pressure = pressureIn;
	}
	
	// set pressure - not less than zero 
	public boolean setPressure(double pressureIn) {
		if(pressureIn < 0) // pressure should not be negative
		{ 
			return false;
		}
		else
		{
			pressure = pressureIn;
			return true; 
		}
	}
	
	// get pressure 
	public double getPressure() {
		return pressure;
	}

}
