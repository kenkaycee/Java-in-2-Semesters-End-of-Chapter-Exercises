/*
 * Write a program that makes use of nested for loops to display the following
shapes:
(c) 
****
***
**
*
 */
public class Exercise3c {

	public static void main(String[] args) {
		for(int i = 4; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
