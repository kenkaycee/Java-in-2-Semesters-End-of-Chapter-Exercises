import java.util.*;
public class EasyScanner {
	Scanner sc = new Scanner(System.in);
	// method to input int variables
	public static int nextInt() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	// method to input double variables
	public static double nextDouble() {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		return d;
	}
	
	// method to input characters
	public static char nextChar() {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		return c;
	}
	
	// method to input string 
	public static String nextString() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		return str;
	}
}
