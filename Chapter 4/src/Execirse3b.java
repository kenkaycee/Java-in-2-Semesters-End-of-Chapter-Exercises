/*
 * Write a program that makes use of nested for loops to display the following
shapes:
(b) 
***
***
*********
*********
***
***
 */
public class Execirse3b {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 3; j++) // column
			{
				if(i == 3 || i == 4)
				{
					System.out.print("* * * ");

				}
				else 
				{
					System.out.print("* "); // print row of stars
				}
			}
			System.out.println(); // ensures next row is printed on a new line
		}
	}

}
