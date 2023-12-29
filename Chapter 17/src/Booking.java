/*
 * Consider a scenario in which a university allows lecturers to borrow equipment.
The equipment is available for use 5 days a week and for 7 periods during each
day. When the equipment is booked for use, the details of the booking (room
number and lecturer name) are recorded. When no booking is recorded, the
equipment is available for use.
(a) Create a Booking class defined in the UML diagram below:

Booking
-room : String
-name : String
+Booking(String, String)
+getRoom() : String
+getName() : String
 */

public class Booking {
	// attributes 
	private String roomNumber;
	private String lecturerName;
	
	// constructor
	public Booking(String roomIn, String nameIn) {
		roomNumber = roomIn;
		lecturerName = nameIn;				
	}
	
	// get room
	public String getRoom() {
		return roomNumber;
	}
	
	// get name 
	public String getName() {
		return lecturerName;
	}

}