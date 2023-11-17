
public class OblongRooms {

	public static void main(String[] args) {
		/*6. (a) Declare an array called rooms, to hold three Oblong objects. Each
		Oblong object will represent the dimensions of a room in an apartment.*/
		
		Oblong[] rooms = new Oblong[3]; // array of references
		
		/*(b) The three rooms in the apartment have the following dimensions:
			Add three appropriate Oblong objects to the rooms array to represent
			these 3 rooms.*/
		
		// create three oblong objects representing three rooms
		rooms[0] = new Oblong(4.7, 5.2);
		rooms[1] = new Oblong(5.7, 5.2);
		rooms[2] = new Oblong(5.0, 8.1);
		
		/*(c) Write the line of code that would make use of the rooms array to display
		the area of room 3 to the screen.*/
		System.out.println("Area of Room 3: " + rooms[2].calculateArea());		
	}

}
