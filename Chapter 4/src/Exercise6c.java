/*6. (a) Using a for loop, write a program that displays a “6 times” multiplication
table; the output should look like this:
1  6=6
2  6 = 12
3  6 = 18
4  6 = 24
5  6 = 30
6  6 = 36
7  6 = 42
8  6 = 48
9  6 = 54
10  6 = 60
11  6 = 66
12  6 = 72
(b) Adapt the program so that instead of a “6 times” table, the user chooses
which table is displayed
 * (c) Modify the program further by making use of a while loop to carry out
some input validation that ensures that the user enters a number that is never
less than 2. If a number less than 2 is entered an error message should be
displayed and the user is asked to enter another number
 */
import java.util.Scanner;
public class Exercise6c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter number to get the times table: ");
		num = sc.nextInt();
		while(num < 2) // input validation
		{
			System.out.print("Enter a number greater than 1. Re-enter number: ");
			num = sc.nextInt();
		}
		System.out.println("***" + num + " Times Table***");
		
		System.out.println();
		for(int i = 1; i <= 12; i++)
		{
			System.out.println(i + " X " + num + " = " + i * num);
		}
	}

}
