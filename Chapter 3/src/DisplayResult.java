/*
 * 4. Implement the DisplayResult program from Sect. 3.4 which processed an
exam mark, and then adapt the program so that marks of 70 or above are
awarded a distinction rather than a pass
 */
import java.util.*;
public class DisplayResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("What exam mark did you get? ");
		mark = sc.nextInt();
		if (mark >= 40 && mark < 70)
		{
		// executed when test is true
		System.out.println("Congratulations, you passed");
		}
		else if(mark >= 70)
		{
			System.out.println("Big Congrats, You got a distinction");
		}
		else 
		{
		// executed when test is false
		System.out.println("I'm sorry, but you failed");
		}
		System.out.println("Good luck with your other exams");
	}

}
