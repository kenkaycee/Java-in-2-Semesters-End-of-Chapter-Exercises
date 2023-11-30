// subclass of Sensor
/*
 * The SafeSensor class has two constructors. The first sets the maximum safe
value to the given parameter and the actual value of the sensor reading to 10.
The second constructor accepts two parameters, the first is used to set the
maximum safe value and the second is used to set the initial value for the
reading of the sensor.
The setPressure method is redefined so that only safe values (values no
greater than the safe maximum value and no less than zero) are set.
 */
public class SafeSensor extends Sensor{
	// attributes 
	private double max;
	
	// constructors 
	/*
	 * The first sets the maximum safe value to the given parameter and the actual value of the sensor reading to 10.
	 */
	public SafeSensor(double pressureIn) {
		super(pressureIn);
		max = pressureIn; 
	}
	/*The second constructor accepts two parameters, the first is used to set the maximum safe value and the second is used to set the initial value for the
		reading of the sensor.
	 * 
	 */
	
	public SafeSensor(double maxIn, double pressureIn) {
		super(pressureIn);
		max = maxIn;		
	}
	
	// override the set pressure method 
	@Override
	public boolean setPressure(double pressureIn) {
		if((pressureIn >= 0) && (pressureIn <= max)) // values no greater than the safe maximum value and no less than zero
		{
			pressure = pressureIn;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// get max pressure 
	public double getMax() {
		return max;
	}
	
}






