
public class Oblong {
	// the attributes
	private double height;
	private double length;
	
	// the constructor
	public Oblong(double lengthIn, double heightIn) {
		length = lengthIn;
		height = heightIn;
	}
	
	// method to read the length attribute 
	public double getLength() {
		return length;
	}
	
	// method to read the height attribute
	public double getHeight() {
		return height;
	}
	
	// method to set the length attribute 
	public void setLength(double lengthIn) {
		length = lengthIn;
	}
	
	// method to set the height attribute 
	public void setHeight(double heightIn) {
		height = heightIn;
	}
	
	// method that returns the area of the rectangle 
	public double calculateArea() {
		return height * length;
	}
	
	// method that returns the perimeter of the rectangle 
		public double calculatePerimeter() {
			return 2 * (height * length);
		}
}
