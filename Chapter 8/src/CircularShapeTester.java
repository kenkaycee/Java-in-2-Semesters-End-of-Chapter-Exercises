/*
 * 1: (a) Implement the CircularShape class that was discussed in self-test
question 1 above.
(b) Add the calculateDiameter method into this class as discussed in
self-test question 1d and 1e above.
(c) Write a program to test out your class. This program should allow the user
to enter a value for the radius of the circle, and then display the area,
circumference and diameter of this circle on the screen by calling the
appropriate methods of the CircularShape class.
(d) Modify the tester program above so that once the information has been
displayed the user is able to reset the radius of the circle. The area, circumference and diameter of the circle should then be displayed again
 */
import java.util.*;
public class CircularShapeTester {

	public static void main(String[] args) {
		double radius; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		// create circle object 
		CircularShape circle = new CircularShape(radius);
		
		System.out.println();
		System.out.println("****CIRCLE CALCULATION****");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Circumference: " + circle.calculateCircumference());
		System.out.println("Diameter: " + circle.calculateDiameter());
		
		/*
		 * (d) Modify the tester program above so that once the information has been
			displayed the user is able to reset the radius of the circle. The area, circumference and diameter of the circle should then be displayed again
		 */
		
		// reset the radius 
		System.out.println();
		circle.setRadius(20);
		System.out.println();
		System.out.println("****CIRCLE CALCULATION****");
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.calculateArea());
		System.out.println("Circumference: " + circle.calculateCircumference());
		System.out.println("Diameter: " + circle.calculateDiameter());
		
	}

}
