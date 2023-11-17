
public class Exercise2 {

	public static void main(String[] args) {
		// declare two strings
		String codeName, confirm; 
		
		// (a) Prompt to get the user to enter a suitable name into the codeName string;
		System.out.print("Enter the code name of the agent (must start with Agent, greater than 6  letters and ends with 'X'): ");
		codeName = EasyScanner.nextString();
		
		/*(b) Use a while loop to ensure that the string entered is greater than 6 characters in length, if it is not print “INVALID CODENAME” and ask the user
		to re-enter a code name;*/
		
		/*(d) Use the charAt method to ensure that the code name ends with an ‘X’ character;*/
		
		/*(e) Finally use the startsWith method to ensure that, as well as being
			greater than 6 characters in length, the code name entered also starts with the
			words “Agent”.*/
		while(codeName.length() < 6 || codeName.charAt(codeName.length()-1)!= 'X' || !codeName.startsWith("Agent"))
		{
			if(codeName.length() < 6)
			{
				System.out.print("INVALID CODENAME. Enter code name greater than 6 letters: ");
				codeName = EasyScanner.nextString();
			}
			else if(codeName.charAt(codeName.length()-1)!= 'X')
			{
				System.out.print("INVALID CODENAME. Code Name must end with 'X'. Please re-enter Code name: ");
				codeName = EasyScanner.nextString();
			}
			else if(!codeName.startsWith("Agent"))
			{
				System.out.print("INVALID CODENAME. Code Name must start with 'Agent'. Please re-enter Code name: ");
				codeName = EasyScanner.nextString();
			}
			
		}
		
		// below code uses endswith to solve 2 d
		/*
		while(codeName.length() < 6 || !codeName.endsWith("X"))
		{
			if(codeName.length() < 6)
			{
				System.out.print("INVALID CODENAME. Enter code name greater than 6 letters: ");
				codeName = EasyScanner.nextString();
			}
			else if(!codeName.endsWith("X"))
			{
				System.out.print("INVALID CODENAME. Code Name must end with 'X'. Please re-enter Code name: ");
				codeName = EasyScanner.nextString();
			}
			
		}*/
		
		/*(c) Once a valid code name has been entered ask the user to re-enter the code
			name into the confirm string and then use an if else statement to ensure
			that the string entered matches the original code name; if it does, print a
			message “CODE NAME CONFIRMED” otherwise print a message saying
			“CODE NAME MIS-MATCH”;*/
		System.out.print("Re-enter codename into the confirm string: ");
		confirm = EasyScanner.nextString();
		if(confirm.equals(codeName))
		{
			System.out.println("CODE NAME CONFIRMED");
		}
		else
		{
			System.out.println("CODE NAME MIS-MATCH");
		}
		
		
	}

}
