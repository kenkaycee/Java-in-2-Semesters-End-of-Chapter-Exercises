
public class SafeSensorTester {

	public static void main(String[] args) {
		SafeSensor safeSens1 = new SafeSensor(10); // safeSensor object using first constructor
		System.out.println("Pressure: "+ safeSens1.getPressure());
		System.out.println("Safe Maximum Pressure: "+ safeSens1.getMax());
		boolean ok = safeSens1.setPressure(90); // will not set as higher than maximum value
		if(ok)
		{
			System.out.println(safeSens1.getPressure());
		}
		else
		{
			System.out.println("Pressure cannot be set to less than zero or above safe maximum value");
		}
		System.out.println();
		SafeSensor safeSens2 = new SafeSensor(20, 8);
		System.out.println("Pressure: "+ safeSens2.getPressure());
		System.out.println("Safe Maximum Pressure: "+ safeSens2.getMax());
		ok = safeSens2.setPressure(10); // will set a new pressure as it is non negative and lower  than maximum value
		if(ok)
		{
			System.out.println("Pressure: "+ safeSens2.getPressure());
		}
		else
		{
			System.out.println("Pressure cannot be set to less than zero or above safe maximum value");
		}
		
	}

}
