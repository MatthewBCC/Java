// GradeBookTest.java

public class GradeBookTest
{
  public static void main (String[] args)
  {
    GradeBook gradeBook1 = new GradeBook("Introduction To Computer Science", "Dr. Rajan Munitam");

    // Run displayMessage() method on gradeBook1 and gradeBook2 objects
    gradeBook1.displayMessage();
    gradeBook1.inputGrades();
    gradeBook1.displayGradeReport();
  }
}
