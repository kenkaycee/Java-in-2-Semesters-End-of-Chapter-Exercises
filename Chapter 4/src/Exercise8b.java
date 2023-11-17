import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 8. Modify programming Exercise 7, from Sect. 2.12, that caries out some calculations related to a circle as follows:
(a) Add input validation to ensure that the radius entered is always non-negative
(b) Provide a menu interface for this program. For example:
[1] Set radius
[2] Display radius
[3] Display area
[4] Display perimeter
[5] Quit
 */
public class Exercise8b {

	public static void main(String[] args) {
		double  area, circumference;
		final double PI = 3.1416; // pi is constant
		int response;
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); // 2 decimal places
		Scanner sc = new Scanner(System.in);
		System.out.println("***Area and Circumference of a Circle**");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		while(radius < 0) // input validation
		{
			System.out.print("Incorrect entry. Enter a non negative radius: ");
			radius = sc.nextDouble();
		}
		do
		{
			// offer menu of options
			System.out.println();
			System.out.println("[1] Set radius");
			System.out.println("[2] Display radius");
			System.out.println("[3] Display Area");
			System.out.println("[4] Display Circumference");
			System.out.println("[5] Quit");
			System.out.print("Enter choice [1,2,3,4,5]: ");
			response = sc.nextInt(); // get response
			System.out.println();
			
			switch(response)
			{
			case 1: // set radius
				radius = radius;
				break;
			case 2: // Display radius
				System.out.println("radius: " + radius);
				break;
			case 3: // print Area
				area = PI * (radius * radius); // calculate area
				System.out.println("Area = " + df.format(area));
				break;
			case 4: // print circumference
				circumference = 2 * PI * radius; // calculate circumference
				System.out.println("Cirumference = " + df.format(circumference));
				break;
			case 5: // quit program
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("Choose from Options 1-5 only!");
			}
		}while(response != 5); // test for quit option
		
		
		
		
	}

}
