
public class SensorTester {

	public static void main(String[] args) {
		Sensor sens1 = new Sensor();
		Sensor sens2  = new Sensor(10);
		
		System.out.println(sens1.getPressure());
		sens1.setPressure(190);
		System.out.println(sens1.getPressure());

		System.out.println(sens2.getPressure());

	}

}
