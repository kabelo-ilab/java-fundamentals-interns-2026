package Chapter4.Exercises;

import java.util.Scanner;
import java.time.Year;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 **/
public class StudentGrades {
    static String firstname, lastname;
    static int birthYear;
    static double testMark;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greetings();

        System.out.print("Enter firstname: ");
        firstname = sc.next();
        System.out.print("Enter lastname: ");
        lastname = sc.next();
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
        System.out.print("Enter test mark: ");
        testMark = sc.nextDouble();

        display();

    }

    /**
     * Display a greeting message
     */
    static void greetings(){
        System.out.println("Hello, welcome to Student Grading System");
    }

    /**
     * Determine and return the grade based on the Test Mark
     * @param testMark Test Mark
     * @return The grade as (A+, A, B, C, D, D-, F)
     */
    static String determineGrade(double testMark){
        String grade;
        if (testMark >= 90){
            grade = "A+";
        } else if (testMark >= 80) {
            grade = "A";
        }else if (testMark >= 70) {
            grade = "B";
        }else if (testMark >= 60) {
            grade = "C";
        }else if (testMark >= 50) {
            grade = "D";
        }else if (testMark >= 40) {
            grade = "D-";
        }else  {
            grade = "F";
        }
        return grade;
    }

    /**
     * Determines and return the age by subtracting the birth year from the current year
     * @param birthYear Birth Year
     * @return Age as an integer
     */
    static int determineAge(int birthYear){
        final int CURRENT_YEAR = Year.now().getValue();

        return CURRENT_YEAR - birthYear;
    }

    /**
     * Display details of the student as follows:
     * (Firstname, Lastname, Age, Grade)
     */
    static void display(){
        System.out.format("""
                ============OUTPUT============
                Firstname: %s
                Lastname: %s
                Age: %d
                Grade: %s""", firstname, lastname, determineAge(birthYear),
                determineGrade(testMark));
    }




}
