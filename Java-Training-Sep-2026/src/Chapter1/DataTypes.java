package Chapter1;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/28
 **/
public class DataTypes {
    public static void main(String[] args) {
        //Declare
        int intAge;
        short number = 5;
        long longAge = 25;
        double salary = 5000.00;
        float wage = 5000.00f;
        boolean isEmployed;
        char letter = 'A';
        String day = "Today is Monday";

        //Assign
        intAge = 36;
        isEmployed = true;

        //Use
        System.out.println("Age (" + intAge + ", " + longAge + ")");
        System.out.println("Salary: " + salary);
        System.out.println("Wage: " + wage);
        System.out.println("Employed? : " + isEmployed);
        System.out.println("Letter: " + letter);
        System.out.println("Day: " + day);
        System.out.println("Number: " + number);


    }
}
