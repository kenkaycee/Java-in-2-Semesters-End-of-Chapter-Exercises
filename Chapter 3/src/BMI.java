/*
 * 5. In programming Exercise 5 of the previous chapter you were asked to calculate
the BMI of an individual. Adapt this program so that it also reports on whether
the BMI is in a healthy range, or if it indicates the person is underweight or
overweight, using the following table:

<18.5 Underweight
18.5—24.9 Healthy
>24.9 Overweight
 */
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		double height, weight, bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		weight = sc.nextDouble();
		System.out.println("Enter your height in meters: ");
		height = sc.nextDouble();
		bmi = weight / (height * height);
		System.out.println("Your BMI is: " + bmi);
		if(bmi < 18.5)
			{
				System.out.println("You're underweight");
			}
		else if (bmi <= 24.9)
		{
			System.out.println("You're in healthy range");
		}
		else
		{
			System.out.println("You're overwieght");
		}
	}

}
