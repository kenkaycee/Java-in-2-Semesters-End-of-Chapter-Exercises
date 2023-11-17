/*1. In question 7 of the programming exercises at the end of Chap. 2 you wrote a
program that calculated the area and circumference of a circle. Now consider a
class that we could develop for this purpose; we have called it CircularShape. 

1: (a) Implement the CircularShape class that was discussed in self-test
question 1 above.
(b) Add the calculateDiameter method into this class as discussed in
self-test question 1d and 1e above.
(c) Write a program to test out your class. This program should allow the user
to enter a value for the radius of the circle, and then display the area,
circumference and diameter of this circle on the screen by calling the
appropriate methods of the CircularShape class.
(d) Modify the tester program above so that once the information has been
displayed the user is able to reset the radius of the circle. The area, circumference and diameter of the circle should then be displayed again
 * */

public class CircularShape {
	// attributes 
	private double radius;
	private final double PI = 3.1416;
	
	// constructor 
	public CircularShape(double radiusIn) {
		radius = radiusIn;
	}
	
	// methods 
	// set radius 
	public void setRadius(double radiusIn) {
		radius = radiusIn;
	}
	
	// get radius 
	public double getRadius() {
		return radius;
	}
	
	// calculate area 
	public double calculateArea() {
		return (PI * radius * radius);
	}
	
	// calculate circumference
	public double calculateCircumference() {
		return (2 * PI * radius);
	}
	
	// calculate diameter 
	public double calculateDiameter() {
		return (2 * radius);
	}
}
