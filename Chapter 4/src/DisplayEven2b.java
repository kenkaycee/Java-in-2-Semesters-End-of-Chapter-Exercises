/*
 * 2. (a) Modify the DisplayEven program from Sect. 4.2.2 so that the program
displays the even numbers from 1 to 20 instead of from 10 down to 1.

(b) Modify the program further so that the user enters a number and the program displays all the even numbers from 1 up to the number entered by the
user.
 */
import java.util.*;
public class DisplayEven2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter number: ");
		num = sc.nextInt();
		System.out.println("*** Even numbers from 1 to " + num + " ***");
		System.out.println();
		for(int i=1; i <= num; i++) // loop through the numbers 
		 {
			if (i%2 == 0) // check if number is even
				{
					System.out.println(i); // number displayed only when it is checked to be even
				}
		 } 
	}
}
