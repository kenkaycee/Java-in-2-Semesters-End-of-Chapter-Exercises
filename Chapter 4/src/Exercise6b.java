/*
 * 6. (a) Using a for loop, write a program that displays a “6 times” multiplication
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
 */

import java.util.*;
public class Exercise6b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter number to get the times table: ");
		num = sc.nextInt();
		System.out.println("***" + num + " Times Table***");
		
		System.out.println();
		for(int i = 1; i <= 12; i++)
		{
			System.out.println(i + " X " + num + " = " + i * num);
		}
	}

}
