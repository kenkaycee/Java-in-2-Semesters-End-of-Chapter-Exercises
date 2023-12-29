/**
 * @author Kaycee Ezenta
 * @version December 17th, 2023
 * 
 * 1. Copy, from the accompanying website, the Book and Library classes and
then implement a tester for the Library class.
 */


public class LibraryTester {
	
	public static void main(String[] args) {
		Library myLibrary = new Library();
		int choice; 
		do 
		{
			// menu choice 
			System.out.println();
			System.out.println("1. Add book");
			System.out.println("2. Remove book");
			System.out.println("3. Get book");
			System.out.println("4. Total number of books");
			System.out.println("5. Books in the list");
			System.out.println("6. Quit");
			System.out.println();
			System.out.print("Enter choice [1-6]: ");
			choice = EasyScanner.nextInt();
			System.out.println();
			
			// process menu
			switch(choice)
			{
			case 1: option1(myLibrary);break;
			case 2: option2(myLibrary);break;
			case 3: option3(myLibrary);break;
			case 4: option4(myLibrary);break;
			case 5: option5(myLibrary);break;
			case 6: break;
			default: System.out.println("Error: choose from option 1 - 6 only!!!");
			}
		}while(choice != 6);
	}
	
	// add 
	static void option1(Library libraryIn) {
		System.out.print("Enter ISBN of the book : ");
		String isbn = EasyScanner.nextString();
		System.out.print("Enter author: ");
		String author = EasyScanner.nextString();
		System.out.print("Enter book title: ");
		String title = EasyScanner.nextString();
		// create Book object 
		Book bookIn = new Book(isbn, title, author);
		// add book to the collection 
		boolean ok = libraryIn.addBook(bookIn);
		if(ok)
		{
			System.out.println("Book added");
		}
		else
		{
			System.out.println("Book already in the list");
		}
	}
	
	// remove 
	static void option2(Library libraryIn) {
		System.out.print("Enter ISBN of the book you want to remove: ");
		String isbn = EasyScanner.nextString();
		boolean ok = libraryIn.removeBook(isbn);
		if(ok)
		{
			System.out.println("Book removed");
		}
		else
		{
			System.out.println("Error: invalid ISBN");
		}
	}
	
	// get book
	static void option3(Library libraryIn) {
		System.out.print("Enter the ISBN of the book you want to retrieve: ");
		String isbn = EasyScanner.nextString();
		if(libraryIn.getBook(isbn) != null)
		{
			System.out.println(libraryIn.getBook(isbn));
		}
		else 
		{
			System.out.println("Error: Invalid ISBN");
		}
	}
	
	// total books
	static void option4(Library libraryIn) {
		System.out.println("Number of books in the system: " + libraryIn.getTotalNumberOfBooks());
	}
	
	// set of books
	static void option5(Library libraryIn) {
		System.out.println(libraryIn.getAllBooks());
	}
}






