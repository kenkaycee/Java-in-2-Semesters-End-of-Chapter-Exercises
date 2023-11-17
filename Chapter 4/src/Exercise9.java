import java.util.Scanner;

/*
 * 9. Consider a vending machine that offers the following options:
[1] Get gum
[2] Get chocolate
[3] Get popcorn
[4] Get juice
[5] Display total sold so far
[6] Quit
Design and implement a program that continuously allows users to select from
these options. When options 1–4 are selected an appropriate message is to be
displayed acknowledging their choice. For example, when option 3 is selected the
following message could be displayed:
Here is your popcorn
When option 5 is selected, the number of each type of item sold is displayed. For
example:
3 items of gum sold
2 items of chocolate sold
6 items of popcorn sold
9 items of juice sold
When option 6 is chosen the program terminates. If an option other than 1–6 is
entered an appropriate error message should be displayed, such as:
Error, options 1-6 only!
 */
public class Exercise9 {
	public static void main(String[] args) {
		int gum = 0;
		int chocolate = 0;
		int popcorn = 0;
		int juice = 0;
		int response;
		Scanner sc = new Scanner(System.in);
		System.out.println("**Vending Machine Order****");

		do 
		{
			// offer menu of options
			System.out.println();
			System.out.println("[1] Get gum");
			System.out.println("[2] Get chocolate");
			System.out.println("[3] Get popcorn");
			System.out.println("[4] Get juice");
			System.out.println("[5] Display total sold so far");
			System.out.println("[6] Quit");
			System.out.print("Enter choice [1,2,3,4,5,6]: ");
			response = sc.nextInt();
			System.out.println();
			
			switch(response) // process response
			{
			case 1:
				gum ++;
				System.out.println("Here is your Gum");
				break;
			case 2:
				chocolate ++;
				System.out.println("Here is your chocolate");
				break;
			case 3:
				popcorn ++;
				System.out.println("Here is your Popcorn");
				break;
			case 4: 
				juice ++;
				System.out.println("Here is your Juice");
				break;
			case 5:
				if(gum == 1)
				{
					System.out.println(gum + " item of gum sold");
				}
				else
				{
					System.out.println(gum + " items of gum sold");
				}
				if(chocolate == 1)
				{
					System.out.println(chocolate + " item of gum sold");
				}
				else
				{
					System.out.println(chocolate + " items of gum sold");
				}
				if(popcorn == 1)
				{
					System.out.println(popcorn + " item of popcorn sold");
				}
				else
				{
					System.out.println(popcorn + " items of popcorn sold");
				}
				if(juice == 1)
				{
					System.out.println(juice + " item of juice sold");
				}
				else
				{
					System.out.println(juice + " items of juice sold");
				}
				break;
			case 6:
				System.out.println("Thanks for shopping. Goodbye!!!");
				break;
			default:
				System.out.println("Incorrect choice, Choose from 1-6 only!!!");
			}

		}while(response != 6);
	}

}
