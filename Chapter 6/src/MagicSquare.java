/*
 * 5. Design and implement a magic word square program that allows you to test your
answers to self-test question 10 above. The program should initialize the word
square given in the question and then use the methods displayRow and
displayColumn to display all the words in the magic word square.
 */
public class MagicSquare {

	public static void main(String[] args) {
		char[][] magicSquare = {
				{'P', 'R', 'E', 'Y'},
				{'L','A', 'V', 'A'},
				{'O', 'V', 'E', 'R'},
				{'T', 'E', 'N', 'D'}
		};
		System.out.println("***Words in Columns****");
		displayColumn(magicSquare); // call method
		System.out.println();
		System.out.println("***Words in Rows****");

		displayRow(magicSquare);
	}
		
		// method to display the words in the rows requires a nested loop
		static void displayRow(char[][] magicIn) {
			for(int row = 0; row < magicIn.length; row++)
			{
				for(int col = 0; col < magicIn[row].length; col++)
				{
					System.out.print(magicIn[row][col]);
				}
				System.out.println();
			}
		}
	
		// method to display the words in the column requires a nested loop

		static void displayColumn(char[][] magicIn) {
			for(int row = 0; row < magicIn.length; row++)
			{
				for(int col = 0; col < magicIn[row].length; col++)
				{
					System.out.print(magicIn[col][row]);
				}
				System.out.println();
			}
		}

}
