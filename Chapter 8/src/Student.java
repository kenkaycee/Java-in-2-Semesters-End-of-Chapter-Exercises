import java.util.Scanner;

/*
 * 2: (a) Write the code for the Student class discussed in self-test question 2
above. You should note that in order to ensure that a double is returned
from the calculateAverageMark method you should specifically
divide the total of the three marks by 3.0 and not simply by 3 (look back at
Chap. 2 to remind yourself why this is the case).
Another thing to think about is what you choose for the initial values of the
marks. If you chose to give each mark an initial value of zero, this could be
ambiguous; a mark of zero could mean that the mark simply has not been
entered—or it could mean the student actually scored zero in the subject!
Can you think of a better initial value?
You can assume that the fees for the student are set initially to 3000
 */

public class Student {
	// attributes 
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;
	private static double fee;
	Scanner sc = new Scanner(System.in);
	
	// constructor
	public Student(String studentNumberIn, String studentNameIn) {
		studentNumber = studentNumberIn;
		studentName = studentNameIn;
		fee = 3000; //  fees for the student are set initially to 3000.
		/*markForEnglish = -999;
		markForMaths = -999;
		markForScience = -999;*/
	}
	
	// methods 
	// get student number 
	public String getNumber() {
		return studentNumber;
	}
	
	// get student name
	public String getName() {
		return studentName;
	}
	
	// enter marks for the three courses 
	public void enterMarks(int markEnglishIn, int markMathsIn, int markScienceIn) {
		markForEnglish = markEnglishIn;
		markForMaths = markMathsIn;
		markForScience = markScienceIn;
	}
	
	// get  marks
	public int getMathsMark() {
		if(markForMaths == -999)
		{
			System.out.println("Mark not entered");
		}
		return markForMaths;
	}
	
	public int getEnglishMark() {
		if(markForEnglish == -999)
		{
			System.out.println("Mark not entered");
		}
		
		return markForEnglish;
	}
	
	public int getScienceMark() {
		if(markForScience == -999)
		{
			System.out.println("Mark not entered");
		}
		return markForScience;
	}
	
	// calculate average mark 
	public double calculateAverageMark() {
		int totalMark = markForEnglish + markForMaths + markForScience;
		double averageMark = totalMark / 3.0;
		return averageMark;
	}
	
	// set fee 
	public static void setFee(double feeIn) {
		fee = feeIn;
	}
	
	// get fee
	public static double getFee() {
		return fee; 
	}

}










