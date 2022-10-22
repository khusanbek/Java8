// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades.
// then invokes method processGrades to analyze them.
public class GradeBookTest
{
	// main method begins program execution
	public static void main(String[] args)
	{
		// array of student grades
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook myGradeBook = new GradeBook(
			"CS101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
			myGradeBook.getCourseName());
		myGradeBook.processGrades();	
	}
} // end class GradeBookTest
/*
 * Khusanbek Gafurov Practical Codes from JHTP10.
 * These hand written codes are written for educational purposes only.
 * 
 * The JHTP10 is an amazing book, but, I found few mistakes in the source
 * code of the book. So, due to this, decided to hand code myself and 
 * upload here as a reference.
 *
 * Khusanbek Gafurov 2022
 *
**/