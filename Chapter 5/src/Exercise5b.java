/*
 * 5. (a) Write a menu-driven program that provides three options:
• the first option allows the user to enter a temperature in Celsius and displays
the corresponding Fahrenheit temperature;
 the second option allows the user to enter a temperature in Fahrenheit and
displays the corresponding Celsius temperature;
• the third option allows the user to quit.
The formulae that you need are as follows, where C represents a Celsius temperature and F a Fahrenheit temperature:
F = (9C/5) + 32
C = 5(F - 32)/9

(b) Adapt the above program so that the user is not allowed to enter a temperature below absolute zero; this is −273.15C, or −459.67F.
 */

import java.text.DecimalFormat;
import java.util.*;

public class Exercise5b {

	public static void main(String[] args) {
		int choice; // to store menu choice 
		Scanner sc = new Scanner(System.in);
		
		// menu of choice
		do
		{
			System.out.println();
			System.out.println("***Temperature Connversion***");
			System.out.println("Press [1] to convert Celsius to Fahrenheit");
			System.out.println("Press [2] to convert Fahrenheit to Celsius");
			System.out.println("Press [3] to quit");
			System.out.println();
			System.out.println("Enter a number from 1 - 3");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: celsiusToFahr();
			break;
			case 2: fahrToCelsius();
			break;
			case 3: System.out.println("Goodbye");
			break;
			default: System.out.println("Choose option 1 - 3 only!!!");
			}

		}while(choice != 3);
	}
	
	// converts Celsius to Fahrenheit
	static void celsiusToFahr() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); // set to two decimal points
		Scanner sc = new Scanner(System.in);
		double celsiusIn, fahrIn;
		System.out.print("Enter temperature in Celsius: ");
		celsiusIn = sc.nextDouble();
		while(celsiusIn < -273.15) // check that temperature is not below absolute zero
		{
			System.out.println("Temperature cannot be below absolute zero (-273.15C). Re-enter temperature: ");
			celsiusIn = sc.nextDouble();
		}
		fahrIn = ((9 * celsiusIn)/ 5) + 32;
		System.out.println(celsiusIn + " degree Celsisus = " + df.format(fahrIn) + " degree fahrenehit");
		
	}
	// converts Fahrenheit to Celsius 
		static void fahrToCelsius() {
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2); // set to two decimal points
			Scanner sc = new Scanner(System.in);
			double celsiusIn, fahrIn;
			System.out.print("Enter temperature in Fahrenheit: ");
			fahrIn = sc.nextDouble();
			while(fahrIn < -459.67) // check that temperature is not below absolute zero
			{
				System.out.println("Temperature cannot be below absolute zero (-459.67F). Re-enter temperature: ");
				fahrIn = sc.nextDouble();
			}
			celsiusIn = (5*(fahrIn - 32)/9);
			System.out.println(fahrIn + " degree Fahrenheit = " + df.format(celsiusIn) + " degree Celsius");
			
		}

}
