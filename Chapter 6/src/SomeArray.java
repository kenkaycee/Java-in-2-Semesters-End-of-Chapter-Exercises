
public class SomeArray {

	public static void main(String[] args) {
		int[] someArray = {2,5,1,9,11};
		// double all the value in someArry
		for(int i = 0; i < someArray.length; i++)
		{
			System.out.print(someArray[i] * 2 + ", ");
		}
		
		// enhance loop to display the values in the array
		System.out.println();
		System.out.println("Values in the Array");
		for(int value: someArray)
		{
			System.out.println(value);
		}
		
		// Modify the enhanced for loop above so that only numbers greater than 2 are displayed.
		System.out.println();
		System.out.println("Values greater than 2");
		for(int value: someArray)
		{
			if(value > 2)
			{
				System.out.println(value);
			}
		}
	}

}
