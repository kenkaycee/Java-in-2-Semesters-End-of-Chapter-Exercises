
public class SensorTester {

	public static void main(String[] args) {
		// create sensor object with the first constructor - default value of pressure is 0
		Sensor sens1 = new Sensor();
		System.out.println("Pressure: " + sens1.getPressure());
		
		// create sensor object with second constructor
		Sensor sens2 = new Sensor();
		
		// set the pressure to a value at least equals to zero
		sens2.setPressure(20);
		System.out.println("Pressure: " + sens2.getPressure());
		
		// set pressure value to negative
		sens2.setPressure(-1);
		System.out.println("Pressure: " + sens1.getPressure()); // does not change


	}

}
