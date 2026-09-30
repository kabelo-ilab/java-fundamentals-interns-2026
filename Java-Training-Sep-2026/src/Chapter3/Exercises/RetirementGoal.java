package Chapter3.Exercises;

import java.util.Scanner;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 **/
public class RetirementGoal {
    public static void main(String[] args) {
        int years; double annualSavings;
        double pension;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Number of years until retirement:  ");
            years = sc.nextInt();

        }while (years <= 0);

        do {
            System.out.print("Amount you can save annually:  ");
            annualSavings = sc.nextDouble();
        }while (annualSavings <= 0);
         pension = years * annualSavings;

        System.out.format("""
                With an annual contribution of %.2f for %d years,
                your pension at retirement will be R%.2f after %d years""",
                annualSavings, years, pension, years);
    }
}
