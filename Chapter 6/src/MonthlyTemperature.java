/*
 * Consider the MonthlyTemperatures program of Sect. 6.9.4. Write an
additional method, max, that returns the maximum temperature recorded in the
given two-dimensional array.
 */
import java.util.*;
public class MonthlyTemperature {

	public static void main(String[] args) {
		double[][] temp = new double[4][7];
		int choice;
		Scanner sc =  new Scanner(System.in);
		
		// offer menu
		do
		{
			System.out.println();
			System.out.println("[1] Enter temperatures");
			System.out.println("[2] Display all");
			System.out.println("[3] Display one week");
			System.out.println("[4] Display day of the week");
			System.out.println("[5] Display the maximum temperature in a month");
			System.out.println("[6] Check if temperature was recorded in the month");
			System.out.println("[7] Exit");
			System.out.print("Enter choice [1-7]: ");
			choice = sc.nextInt();
			
			// process choice by calling additional methods
			switch(choice)
			{
			case 1: enterTemps(temp);
					break;
			case 2: displayAllTemps(temp);
					break;
			case 3: displayWeekTemps(temp);
					break;
			case 4: displayDayTemps(temp);
					break;
			case 5: double maxTemp = maxTemp(temp);
					System.out.println("Maximum Temperature in the month: " + maxTemp);
					break;
			
			case 6: System.out.print("Enter the temprature you want to search:");
					double tempValue = sc.nextDouble();
					boolean found = containTemps(temp, tempValue);
					if(found)
					{
						System.out.println(tempValue + " was recorded in the month");
					}
					else
					{
						System.out.println(tempValue + " was not recorded in the month");
					}
					break;
			
			case 7: System.out.println("Goodbye!!!");
			break;
			default: System.out.println("ERROR: options 1-8 only!");
			}
		}while(choice != 7);
		
	}
	
	// method to enter temperatures requires a nested loop
	static double[][] enterTemps(double[][] tempIn){
		Scanner sc = new Scanner(System.in);
		// outer loop controls the week number
		for(int week = 1; week <= tempIn.length; week++)
		{
			// inner loop controls the day number
			for(int day = 1; day <= tempIn[0].length; day++)
			{
				System.out.print("Enter temp (in degree Celius) for week " + week + " and day " + day + ": ");
				tempIn[week-1][day-1] = sc.nextDouble();
				// input validation: temperature should not be below absolute zero (-273.15C)
				while(tempIn[week-1][day-1] < -273.15)
				{
					System.out.print("Invalid temperature. Temperature should not be below -273.15C. Re-enter temperature: ");
					tempIn[week-1][day-1] = sc.nextDouble();
				}
			}
		}
		return tempIn;
	}
	// method to display all temperatures requires a nested loop
	static void displayAllTemps(double[][] tempIn) {
		System.out.println();
		System.out.println("****MONTHLY TEMPERATURE****");
		System.out.println();
		
		for(int week = 1; week <= tempIn.length; week++)
		{
			for(int day = 1; day <= tempIn[0].length; day++)
			{
				System.out.println("Week " + week + " Day " + day + ": " + tempIn[week-1][day-1]);
			}
		}
	}
	
	// method to display temperature for a given week requires a single loop 
	static void displayWeekTemps(double[][] tempIn) {
		Scanner sc = new Scanner(System.in);
		int week; 
		System.out.print("Enter week number (1 - 4): ");
		week = sc.nextInt();
		// input validation: week number between 1 and 4
		while(week < 1 || week > 4)
		{
			System.out.print("Invalid week number. Re-enter 1 - 4 only: ");
			week = sc.nextInt();
		}
		System.out.println();
		System.out.println("****TEMPERATURES FOR WEEK " + week +"****");
		System.out.println();
		// week number is fixed by the user, single loop to process the day
		for(int day = 1; day <= tempIn[0].length; day++)
		{
			System.out.println("Week " + week + " Day " + day + ": " + tempIn[week-1][day-1]);
		}
	}
	// method to display temperature for a given week requires a single loop 
		static void displayDayTemps(double[][] tempIn) {
			Scanner sc = new Scanner(System.in);
			int day; 
			System.out.print("Enter day number (1 - 7): ");
			day = sc.nextInt();
			// input validation: week number between 1 and 7
			while(day < 1 || day > 7)
			{
				System.out.print("Invalid day number. Re-enter 1 - 7 only: ");
				day = sc.nextInt();
			}
			System.out.println();
			System.out.println("****TEMPERATURES FOR Day " + day +"****");
			System.out.println();
			// day number is fixed by the user, single loop to process the week
			for(int week = 1; week <= tempIn.length; week++)
			{
				System.out.println("Week " + week + " Day " + day + ": " + tempIn[week-1][day-1]);
			}
		}
		
		// method to return the maximum temperature in a 2d array
		static double maxTemp(double[][] tempIn) {
			// set maximum temperature to be first number in the array
			double max = tempIn[0][0];
			for(int week = 1; week <= tempIn.length; week++)
			{
				for(int day = 1; day <= tempIn[0].length; day++)
				{
					if(tempIn[week-1][day-1] >  max)
					{
						max = tempIn[week-1][day-1];
					}
				}
			}
			return max;
		}
		
		// method to check if a given temperature is in a 2d array requires a nested loop
		static boolean containTemps(double[][]tempIn, double valueIn) {
			for(int week = 1; week <= tempIn.length; week++)
			{
				for(int day = 1; day <= tempIn.length; day++)
				{
					if(tempIn[week-1][day-1] == valueIn)
					{
						return true;
					}
				}
			}
			return false;
		}		
}


















