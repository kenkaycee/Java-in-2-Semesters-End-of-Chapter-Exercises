
public class IncubatorTester {

	public static void main(String[] args) {
		// create incubator object 
		Incubator incubator1 = new Incubator(); // temperature set to 5 degrees by default 
		System.out.println("Temperature: " + incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		incubator1.increaseTemp();
		System.out.println("New temperature: "+ incubator1.getTemperature());
		
	}

}
