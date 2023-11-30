
public class SecondHandVehicleTester {

	public static void main(String[] args) {
		// create secondhandvehicle object 
		SecondHandVehicle vehicle = new SecondHandVehicle("AA3 0LY", "Audi", 2018, 12500, 1);
		System.out.println("Reg No: " + vehicle.getRegNo());
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Year manufactured: " + vehicle.getYearOfManufacture());
        System.out.println("Value: " + vehicle.getValue());
        System.out.println("Number of owners: " + vehicle.getNumberOfOwners());
        boolean ok = vehicle.hasMultipleOwners();
        if(ok)
        {
            System.out.println("This car has been owned by " + vehicle.getNumberOfOwners() + " persons");
        }
        else
        {
            System.out.println("This car has been owned by only one person");
        }

	}

}
