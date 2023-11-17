/*
 * 2. (a) Modify the DisplayEven program from Sect. 4.2.2 so that the program
displays the even numbers from 1 to 20 instead of from 10 down to 1.
 */
public class DisplayEven {

	public static void main(String[] args) {
		System.out.println("*** Even numbers from 1 to 20 ***");
		System.out.println();
		for(int i=1; i <= 20; i++) // loop through the numbers 1  to 20
		 {
			if (i%2 == 0) // check if number is even
				{
					System.out.println(i); // number displayed only when it is checked to be even
				}
		 } 
	}
}
