// GradeBookTest.java

import java.util.Scanner;

public class GradeBookTest
{
  public static void main (String[] args)
  {
    GradeBook gradeBook1 = new GradeBook("Introduction To Computer Science", "Dr. Rajan Munitam");
    GradeBook gradeBook2 = new GradeBook("Data Structures In Java", "Dr. Rutanijam Sundar");

    // Run displayMessage() method on gradeBook1 and gradeBook2 objects
    gradeBook1.displayMessage();
    gradeBook2.displayMessage();
  }
}
