import java.util.*;
public class OblongArrayList {

	public static void main(String[] args) {
		/*7. Repeat the previous question using and ArrayList instead of an array.*/
		
		// create an array of reference 
		ArrayList<Oblong> rooms = new ArrayList<>();
		
		// create three new rooms
		rooms.add(new Oblong(4.7, 5.2));
		rooms.add(new Oblong(5.7, 5.2));
		rooms.add(new Oblong(5, 8.1));
		
		// display area of room 3
		System.out.println("Area of room 3: " + rooms.get(2).calculateArea());
		System.out.println();
		// area of the rooms
		System.out.println("****AREA OF THE ROOMS****");
		int i = 0;
		for(Oblong room: rooms)
		{
			i++;
			System.out.println("Area of room " + i + ": "  + room.calculateArea());
		}
		
		System.out.println();
		// Perimter of the rooms
		System.out.println("****PERIMETER OF THE ROOMS****");
		int j = 0;
		for(Oblong room: rooms)
		{
			j++;
			System.out.println("Perimeter of room " + j + ": "  + room.calculatePerimeter());
		}
	}

}
