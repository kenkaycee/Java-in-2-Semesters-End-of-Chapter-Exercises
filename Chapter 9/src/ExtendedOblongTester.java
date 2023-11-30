/*
 * 1. (a) Copy the ExtendedOblong class from the website, then implement the
ExtendedOblongTester from Sect. 9.4. You will, of course, need to
ensure that the Oblong class itself is accessible to the compiler.
(b) Modify the ExtendedOblongTester program so that the user is able to
choose the symbol used to display the oblong.
 */
public class ExtendedOblongTester
{
	public static void main(String[] args)
	{
		ExtendedOblong extOblong; // reference to class extOblong
		// ask details from user 
		System.out.print("Enter length: ");
		double length = EasyScanner.nextDouble();
		System.out.print("Enter height: ");
		double height = EasyScanner.nextDouble();
		System.out.print("Choose symbol: ");
		char symbol = EasyScanner.nextChar();
		extOblong = new ExtendedOblong(length, height, symbol);
		System.out.println(extOblong.draw());
	}
}
