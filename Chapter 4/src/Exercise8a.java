/*
 * 8. Modify programming Exercise 7, from Sect. 2.12, that caries out some calculations related to a circle as follows:
(a) Add input validation to ensure that the radius entered is always non-negative
 */
import java.text.DecimalFormat;
import java.util.*;
public class Exercise8a {

	public static void main(String[] args) {
		double radius, area, circumference;
		final double PI = 3.1416; // pi is constant
		Scanner sc = new Scanner(System.in);
		System.out.println("***Area and Circumference of a Circle**");
		System.out.println();
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		while(radius < 0) // input validation
		{
			System.out.print("Incorrect entry. Enter a non negative radius: ");
			radius = sc.nextDouble();
		}
		circumference = 2 * PI * radius; // calculate circumference
		area = PI * (radius * radius); // calculate area
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("Circumference = " + df.format(circumference) + "\nArea = " + df.format(area));
		
	}

}
