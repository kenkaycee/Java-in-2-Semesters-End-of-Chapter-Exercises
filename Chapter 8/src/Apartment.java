/**
 * In programming Exercise 6 of the last chapter you were asked to develop a
program to process a collection of rooms in an apartment. Now consider a
collection class, Apartment, for this purpose. The Apartment class
would store a collection of Oblong objects, where each Oblong object
represents a particular room in the apartment. The UML diagram depicting
the association between the Apartment class and the Oblong class is
shown below:
 * @author kezen
 *
 */
import java.util.*;
public class Apartment {
	// attribute
	private ArrayList<Oblong>rooms = new ArrayList<>();	

	// add room
	public boolean addRoom(double lengthIn, double heightIn) {
		rooms.add(new Oblong(lengthIn, heightIn));
		return true;
	}
	
	// get room area
	public double getRoomArea(int roomNumber) {
		for(int i = 1; i <= rooms.size(); i++)
		{
			if(roomNumber == i)
			{
				return rooms.get(roomNumber - 1).calculateArea();
			}
		}
		return -999;
	}
	
	// get room length 
	public double getRoomLength(int roomNumber) {
		for(int i = 1; i <= rooms.size(); i++)
		{
			if(roomNumber == i)
			{
				return rooms.get(roomNumber - 1).getLength();
			}
		}
		return -999;
	}
	
	// get room height 
	public double getRoomHeight(int roomNumber) {
		for(int i = 1; i <= rooms.size(); i++)
		{
			if(roomNumber == i)
			{
				return rooms.get(roomNumber - 1).getHeight();
			}
		}
		return -999;
	}

	// total room 
	public int getTotal(){
		return rooms.size();
	}
}
