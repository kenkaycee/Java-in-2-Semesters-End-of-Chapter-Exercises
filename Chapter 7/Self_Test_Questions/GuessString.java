
public class GuessString {

	public static void main(String[] args) {
		/*4. Consider the following fragment of code that initializes one string constant with
		a password (“java”) and creates a second string to hold the user’s guess for the
		password. The user is then asked to enter their guess:*/
		final String PASSWORD = "java"; // set password
		String guess; // to hold user’s guess
		System.out.print("Enter guess: ");
		
		/*(a) Write a line of code that uses the EasyScanner class to read the guess
		from the keyboard.*/
		guess = EasyScanner.nextString();
		
		/*(b) Write the code that displays the message “CORRECT PASSWORD” if the
		user entered the correct password and “INCORRECT PASSWORD” if not.*/
		
		if(guess.equals(PASSWORD))
		{
			System.out.println("CORRECT PASSWORD");
		}
		else
		{
			System.out.println("INCORRECT PASSWORD");
		}
	}

}
