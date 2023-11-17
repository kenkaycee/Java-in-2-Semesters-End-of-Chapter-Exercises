/*
 * 8. Design and implement a program that allows you to test your answers to
self-test question 11 above. The program should allow the user to enter numbers
into the ragged triangle array and then find the largest number in the array as
discussed in the question.
 */
import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		int[][] triangle = new int[4][]; // declare array 
		Scanner sc = new Scanner(System.in);
		triangle[0] = new int[4];
		triangle[1] = new int[3];
		triangle[2] = new int[2];
		triangle[3] = new int[1];
		
		// call methods 
		fillRaggedArray(triangle);
		displayAllValues(triangle);
		displayMaximum(triangle);
	}
		
		// method to input values in a ragged 2D array
		static int[][] fillRaggedArray(int[][] triangeIn) {
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < triangeIn[0].length; i++)
			{
				System.out.print("Enter numbers for column 1: ");
				triangeIn[0][i] = sc.nextInt();
			}
			System.out.println();
			for(int i = 0; i < triangeIn[1].length; i++)
			{
				System.out.print("Enter numbers for column 2: ");
				triangeIn[1][i] = sc.nextInt();
			}
			System.out.println();
			for(int i = 0; i < triangeIn[2].length; i++)
			{
				System.out.print("Enter numbers for column 3: ");
				triangeIn[2][i] = sc.nextInt();
			}
			System.out.println();
			for(int i = 0; i < triangeIn[3].length; i++)
			{
				System.out.print("Enter numbers for column 4: ");
				triangeIn[3][i] = sc.nextInt();
			}
			return triangeIn;
		}
		
		
		// method to display t all elements in triangle array
		static void displayAllValues(int[][] triangleIn) {
			System.out.println();

			System.out.println("***VALUES IN TRIANGLE***");
			System.out.println();
			for(int row = 0; row < triangleIn.length; row++)
			{
				for(int col = 0; col < triangleIn[row].length; col++)
				{
					System.out.println(triangleIn[row][col]);
				}
			}
		}
	
		// method to display max value in a ragged array
		static void displayMaximum(int[][] triangleIn) {
			System.out.println();
			int max = triangleIn[0][0];
			for(int row = 0; row < triangleIn.length; row++)
			{
				for(int col = 0; col < triangleIn[row].length; col++)
				{
					if(triangleIn[row][col] > max)
					{
						max = triangleIn[row][col];
					}
				}
			}
			System.out.println("Max number in array: " + max);
		}
		
	
		
	

}
