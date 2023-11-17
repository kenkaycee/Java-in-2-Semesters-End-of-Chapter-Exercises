/*
 * 6. Write a program to take an order for a new computer. The basic system costs
375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
43 cm screen (costing 99.99). The following extras are optional.
Item Price
Antivirus software 65.99
Printer 125.00
The program should allow the user to select from these extras and then display
the final cost of the order.
 */
import java.util.*;
public class ComputerCost {

	public static void main(String[] args) {
		double basicCost = 375.99;
		double screen38 = 75.99;
		double screen43 = 99.99;
		double antivirusCost = 65.99;
		double printerCost = 125;
		char screenSize, extraProduct;
		double totalCost;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Screen Size: [Press a for 38cm or b for 43cm]: ");
		screenSize = sc.next().charAt(0);
		screenSize = Character.toLowerCase(screenSize); // converts to lower case
		if(screenSize == 'a') // choose 38cm screen
		{
			totalCost = basicCost + screen38;
			
			// choose extra products
			System.out.println("Do you want extra products? [Press a for antivirus, b for printer, n for no extra and c for both antivirus and printer");
			extraProduct = sc.next().charAt(0);
			extraProduct = Character.toLowerCase(extraProduct);
			switch(extraProduct)
			{
				case 'a':
					totalCost = basicCost + screen38 + antivirusCost; // add antivirus
					break;
				case 'b':
					totalCost = basicCost + screen38 + printerCost; // add printer
					break;
				case 'c':
					totalCost = basicCost + screen38 + printerCost + antivirusCost; // add printer and antivirus
					break;
				case 'n':
					totalCost = basicCost + screen38;
					break;
				default: 
					System.out.println("No such options. Choose from options a, b, c and n.");
			}
			System.out.println("Total cost: " + totalCost);
		}
		
		else if(screenSize == 'b') // choose 43cm screen
		{
			totalCost = basicCost + screen43;
			
			// choose extra products
			System.out.println("Do you want extra products? [Press a for antivirus, b for printer, n for no extras and c for both antivirus and printer");
			extraProduct = sc.next().charAt(0);
			extraProduct = Character.toLowerCase(extraProduct);
			switch(extraProduct)
			{
				case 'a':
					totalCost = basicCost + screen43 + antivirusCost; // add antivirus
					break;
				case 'b':
					totalCost = basicCost + screen43 + printerCost; // add printer
					break;
				case 'c':
					totalCost = basicCost + screen43 + printerCost + antivirusCost; // add printer and antivirus
					break;
				case 'n':
					totalCost = basicCost + screen43;
					break;
				default: 
					System.out.println("No such options. Choose from options a, b, c and n.");
			}
			System.out.println("Total cost: " + totalCost);
		}
	}

}
