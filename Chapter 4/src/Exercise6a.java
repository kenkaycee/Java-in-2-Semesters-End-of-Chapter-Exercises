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
 */
public class Exercise6a {

	public static void main(String[] args) {
		System.out.println("***6 Times Table***");
		System.out.println();
		for(int i = 1; i <= 12; i++)
		{
			System.out.println(i + " X 6 " + " = " + i * 6);
		}
	}

}
