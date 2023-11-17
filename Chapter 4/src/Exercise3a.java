/*
 * Write a program that makes use of nested for loops to display the following
shapes:
(a) 
******
******
******
 */
public class Exercise3a {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 6; j++) // column
			{
				System.out.print("* "); // print row of stars
			}
			System.out.println(); // ensures next row is printed on a new line
		}
	}

}
