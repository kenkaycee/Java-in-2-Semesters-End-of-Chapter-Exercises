
public class Incubator {
	// attributes
	private int temperature;
	static int max = 10;
	static int min = -10;
	
	public Incubator() {
		temperature = 5; // set temperature to 5
	}
	
	// method to get temperature
	public int getTemperature()
	{
		return temperature;
	}
	/*The increaseTemp method increases the temperature by 1, and the decreaseTemp method decreases the temperature by 1. However, the temperature must never be allowed to rise above a maximum value of 10 nor fall below
a minimum value of −10. If an attempt is made to increase or decrease the
temperature so it falls outside this range, then an alarm must be raised; the
methods in this case should not increase or decrease the temperature but should
return a value of false, indicating that the alarm should be raised. If the
temperature is changed successfully, however, a value of true is returned.*/
	
	public boolean increaseTemp()
	{
		if(temperature < max)
		{
			temperature+=1;
			return true;
		}
		else
		{
			System.out.println("You cannot increase the temperature above 10 degrees");
			return false;
		}
	}
	public boolean decreaseTemp()
	{
		if(temperature < min)
		{
			temperature-=1;
			return true;
		}
		else
		{
			System.out.println("You cannot decrease the temperature lower than minus 10 degrees");
			return false;
		}
	}
}
	
	
	