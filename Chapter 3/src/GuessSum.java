/*
 * 3. Design and implement a program that asks the user to enter two numbers and
then guess at the sum of those two numbers. If the user guesses correctly a
congratulatory message is displayed, otherwise a commiseration message is
displayed along with the correct answer
 */
import java.util.*;
public class GuessSum {

	public static void main(String[] args) {
		int firstNum, secondNum, total, guessTotal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		secondNum = sc.nextInt();
		System.out.println("What is the sum of " + firstNum + " and " + secondNum + ":");
		guessTotal = sc.nextInt(); // guess sum of two numbers 
		total = firstNum + secondNum;
		// check if user got it right 
		if(guessTotal == total)
		{
			System.out.println("Congrats");
		}
		else
		{
			System.out.println("Sorry, that's wrong. The sum of " + firstNum + " and " + secondNum + " is: " + total);
		}

	}

}
