import java.util.ArrayList;
import java.util.Scanner;

/*
 * (b) Write a tester class to test out your Student class; it should create two or
three students (or even better an ArrayList of students), and use the
methods of the Student class to test whether they work according to the
specification.
 */
public class StudentTester {

	public static void main(String[] args) {
		// array of reference 
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// create three student objects 
		studentList.add(new Student("10090", "Kay Eze"));
		studentList.add(new Student("10098", "Ugo Eneh"));
		studentList.add(new Student("10087", "Kevin Owen"));
		
		int i = 0;
		Student.setFee(890);
		for(Student item: studentList)
		{
			i++;
			System.out.println("Student " + (i) + " details: ");
			System.out.println("Student Name: " + item.getName());
			System.out.println("Student Number: " + item.getNumber());
			System.out.print("Enter English mark: ");
			int englishMark = sc.nextInt();
			while(englishMark < 0 || englishMark > 100)
			{
				System.out.println("Mark cannot be less than zero or greater than 100. Re-enter: ");
				englishMark = sc.nextInt();

			}
			System.out.print("Enter Maths mark: ");
			int mathsMark = sc.nextInt();
			while(mathsMark < 0 || mathsMark > 100)
			{
				System.out.println("Mark cannot be less than zero or greater than 100. Re-enter: ");
				mathsMark = sc.nextInt();

			}
			System.out.print("Enter Science mark: ");
			int scienceMark = sc.nextInt();
			while(scienceMark < 0 || scienceMark > 100)
			{
				System.out.println("Mark cannot be less than zero or greater than 100. Re-enter: ");
				scienceMark = sc.nextInt();

			}
			item.enterMarks(englishMark, mathsMark, scienceMark);
			System.out.println("English Score: " + item.getEnglishMark());
			System.out.println("Maths Score: " + item.getMathsMark());
			System.out.println("Science Score: " + item.getScienceMark());
			System.out.println("Average Score: " + item.calculateAverageMark());
			System.out.println("Fees: " + Student.getFee());
			System.out.println();
			System.out.println();
		}
	}

}
