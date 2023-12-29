import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RegistrationNumberSet {
	public static void main(String[] args) {
		Set<String> regNums = new HashSet<>();
		regNums.add("V53PLS");
		regNums.add("X85ADZ");
		regNums.add("L22SBG");
		regNums.add("W79TRV");
		regNums.add("N65DAS");
		
		// display all registrations ending in 'S' using an enhanced for loop
		System.out.println("Registration that ends in 'S' using an enhanced for loop");
		
		for(String item: regNums)
		{
			if(item.endsWith("S"))
			{
				System.out.println(item);
			}
		}
		
		// display all registrations ending in 'S' using a forEach loop
		System.out.println();
		System.out.println("Registration that ends in 'S' using a forEach loop");
		regNums.forEach(item -> 
		{
			if(item.endsWith("S"))
			{
				System.out.println(item);
			}
		});
		
		//use iterator method to remove all registration numbers ending in ‘S’.
		System.out.println();
		Iterator<String> elements = regNums.iterator();
		System.out.println("Items before removing: " + regNums);

		while(elements.hasNext())
		{
			String item = elements.next();
			if(item.endsWith("S"))
			{
				elements.remove();
			}
		}
		System.out.println();
		System.out.println("Items after removing: " + regNums);
	}
}
