package Chapter6;

/*
The program should:
1. Display all student marks.
2. Calculate the total of all marks.
3. Calculate the average mark.
4. Find the highest mark.
5. Find the lowest mark.
6. Count how many students passed.
7. Increase every student's mark by 5 bonus marks.
8. Ensure that no mark exceeds 100 after adding the bonus.
A student passes if their mark is 50 or higher.
*/
public class StudentResultsDebug {

    public static void main(String[] args) {

        int[] marks = {78, 45, 67, 89, 32, 50, 94, 61};

        System.out.println("ORIGINAL STUDENT RESULTS");
        System.out.println("------------------------");

        displayMarks(marks);

        int total = calculateTotal(marks);
        double average = calculateAverage(marks);

        int highest = findHighest(marks);
        int lowest = findLowest(marks);

        int passed = countPassed(marks);

        System.out.println("\nRESULT SUMMARY");
        System.out.println("Total marks: " + total);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Number of students who passed: " + passed);

        addBonusMarks(marks, 5);

        System.out.println("\nRESULTS AFTER BONUS");
        System.out.println("-------------------");

        displayMarks(marks);
    }


    public static void displayMarks(int[] marks) {

        for (int i = 0; i < marks.length - 1; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }


    public static int calculateTotal(int[] marks) {

        int total = 0;

        for (int i = 1; i < marks.length; i++) {
            total = marks[i];
        }

        return total;
    }


    public static double calculateAverage(int[] marks) {

        int total = calculateTotal(marks);

        double average = total / marks.length;

        return average;
    }


    public static int findHighest(int[] marks) {

        int highest = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < highest) {
                highest = marks[i];
            }
        }

        return highest;
    }


    public static int findLowest(int[] marks) {

        int lowest = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        return lowest;
    }


    public static int countPassed(int[] marks) {

        int count = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > 50) {
                count++;
            }
        }

        return count;
    }


    public static void addBonusMarks(int[] marks, int bonus) {

        for (int i = 0; i < marks.length; i++) {

            marks[i] =+ bonus;

            if (marks[i] > 100) {
                marks[i] = 0;
            }
        }
    }
}