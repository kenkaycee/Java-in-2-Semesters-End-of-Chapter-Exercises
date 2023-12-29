
public class TimeTableApplication {

	public static void main(String[] args) {
		TimeTable myTimeTable = new TimeTable(5, 7);
		
		int choice;
		// offer menu
		do
		{
			System.out.println();
			System.out.println("1. Make booking");
			System.out.println("2. Cancel booking");
			System.out.println("3. Check if day and period available for booking");
			System.out.println("4. Number of days in the timetable");
			System.out.println("5. Number of period in the timetable");
			System.out.println("6. Display booking details");
			System.out.println("7. Quit");
			System.out.println();
			
			//get choice 
			System.out.print("Enter choice: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			
			//process menu
			switch(choice)
			{
			case 1: option1(myTimeTable);break;
			case 2: option2(myTimeTable);break;
			case 3: option3(myTimeTable);break;
			case 4: option4(myTimeTable);break;
			case 5: option5(myTimeTable);break;
			case 6: option6(myTimeTable);break;
			case 7: break;
			default: System.out.println("Invalid entry. Emter choice 1 - 7 only!");
			}
		}while(choice != 7);
	}
	
	// make a booking
	static void option1(TimeTable timeTableIn) {
		System.out.print("Enter day of the week: ");
		int day = EasyScanner.nextInt();
		// input validation: day number should be between 1 and 5
    	while(day < 1 || day > 5)
    	{
    		System.out.print("Invalid number!. Enter 1 - 5 only: ");
    		day = EasyScanner.nextInt();
    	}
		System.out.print("Enter period of the day: ");
		int period = EasyScanner.nextInt();
		// input validation: period of the day should be between 1 and 7
    	while(period < 1 || period > 7)
    	{
    		System.out.print("Invalid number!. Enter 1 - 7 only: ");
    		period = EasyScanner.nextInt();
    	}
		System.out.print("Enter the room number you want to book: ");
		String roomNumber = EasyScanner.nextString();
		System.out.print("Enter your name: ");
		String name = EasyScanner.nextString();
		// booking object 
		Booking booking = new Booking(roomNumber, name);
		boolean success = timeTableIn.makeBooking(day, period, booking);
		if(success)
		{
			System.out.println("Booking successfully made");
		}
		else
		{
			System.out.println("Room already booked for this slot");
		}
	}
	
	// cancel booking
	static void option2(TimeTable timeTableIn) {
		System.out.print("Enter day of the week: ");
		int day = EasyScanner.nextInt();
		// input validation: day number should be between 1 and 5
    	while(day < 1 || day > 5)
    	{
    		System.out.print("Invalid number!. Enter 1 - 5 only: ");
    		day = EasyScanner.nextInt();
    	}
		System.out.print("Enter period of the day: ");
		int period = EasyScanner.nextInt();
		// input validation: period of the day should be between 1 and 7
    	while(period < 1 || period > 7)
    	{
    		System.out.print("Invalid number!. Enter 1 - 7 only: ");
    		period = EasyScanner.nextInt();
    	}
		boolean success = timeTableIn.cancelBooking(day, period);
		if(success)
		{
			System.out.println("Booking cancelled");
		}
		else
		{
			System.out.println("You cannot cancel this booking as it is not booked already");
		}
	}
	
	// day and period is available for booking 
	static void option3(TimeTable timeTableIn) {
		System.out.print("Enter day of the week: ");
		int day = EasyScanner.nextInt();
		// input validation: day number should be between 1 and 5
    	while(day < 1 || day > 5)
    	{
    		System.out.print("Invalid number!. Enter 1 - 5 only: ");
    		day = EasyScanner.nextInt();
    	}
		System.out.print("Enter period of the day: ");
		int period = EasyScanner.nextInt();
		// input validation: period of the day should be between 1 and 7
    	while(period < 1 || period > 7)
    	{
    		System.out.print("Invalid number!. Enter 1 - 7 only: ");
    		period = EasyScanner.nextInt();
    	}
		boolean free = timeTableIn.isFree(day, period);
		if(free)
		{
			System.out.println("This day and period is available for booking");
		}
		else
		{
			System.out.println("This day and period is not available for booking");
		}
	}
	
	// number of days in the timetable
	static void option4(TimeTable timeTableIn) {
		System.out.println("Number of days: " + timeTableIn.numberOfDays());
	}
	
	// number of periods in the time table
	static void option5(TimeTable timeTableIn) {
		System.out.println("Number of period: " + timeTableIn.numberOfPeriods());
	}
	
	// get booking details
	static void option6(TimeTable timeTableIn) {
		System.out.print("Enter day of the week: ");
		int day = EasyScanner.nextInt();
		// input validation: day number should be between 1 and 5
    	while(day < 1 || day > 5)
    	{
    		System.out.print("Invalid number!. Enter 1 - 5 only: ");
    		day = EasyScanner.nextInt();
    	}
		System.out.print("Enter period of the day: ");
		int period = EasyScanner.nextInt();
		// input validation: period of the day should be between 1 and 7
    	while(period < 1 || period > 7)
    	{
    		System.out.print("Invalid number!. Enter 1 - 7 only: ");
    		period = EasyScanner.nextInt();
    	}
		Booking ok = timeTableIn.getBooking(day, period);
		if(ok != null)
		{
			System.out.println("Lecture name: " + ok.getName());
			System.out.println("Room number: " + ok.getRoom());
		}
		else
		{
			System.out.println("No slot booked");
		}
	}
}














