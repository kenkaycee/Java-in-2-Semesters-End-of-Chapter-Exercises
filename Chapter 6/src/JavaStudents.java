import java.util.*;
/*
 * 4. Assume that an array has been declared in main as follows:
int[] javaStudents;
This array is to be used to store a list of student exam marks. Now, for each of
the following methods, write the code for the given method and the instruction
in main to call this method:
(a) A method, enterExamMarks, that prompts the user to enter some exam
marks (as integers), stores the marks in an array and then returns this array.
(b) A method, increaseMarks, that accepts an array of exam marks and
increases each mark by 5.
(c) A method, allHavePassed, that accepts an array of exam marks and
returns true if all marks are greater than or equal to 40, and false
otherwise.
 */
public class JavaStudents {

	public static void main(String[] args) {
		int[] javaStudents;
		javaStudents = enterExamMarks();
		increaseMarks(javaStudents);
		boolean passed = allHavePassed(javaStudents);
		if(passed)
		{
			System.out.println("Congrats, you passed");
		}
		else
		{
			System.out.println("I'm sorry, you failed.");
		}
		
	}
	// method that prompts user to enter and return marks
	static int[] enterExamMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many marks do you want to enter?: ");
		int size = sc.nextInt();
		int [] markIn = new int[size];
		for(int i = 0; i < markIn.length; i++)
		{
			System.out.print("Enter exam marks: ");
			markIn[i] = sc.nextInt();
			// input validation: mark should be between 0 and 100
			while(markIn[i] < 0 || markIn[i] > 100)
			{
				System.out.print("Invalid mark. Re-enter 0 - 100 only: ");
				markIn[i] = sc.nextInt();
			}
		}	
		return markIn;
	}
	
	// method that increases mark by 5
	static void increaseMarks(int[] markIn) {
		System.out.println("Increase marks by 5");
		for(int i = 0; i < markIn.length; i++)
		{
			// check that new mark is not greater than 100
			if((markIn[i] + 5) > 100)
			{
				System.out.println("New Marks after adding 5: " + 100);
			}
			else
			{
				System.out.println("New Marks after adding 5: " + (markIn[i] + 5));

			}
		}
	}
	
	// method that returns true if all values in marks array is greater than or equal to 40
	static boolean allHavePassed(int[] markIn) {
		for(int i = 0; i < markIn.length; i++) {
			if(markIn[i] < 40)
			{
				return false;
			}
		}
		return true;
	}
}
















