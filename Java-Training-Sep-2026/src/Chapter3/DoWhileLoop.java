package Chapter3;

import java.util.Scanner;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 * Prompt the user for any number of integers,
 * calculate and their sum, average.
 * Enter zero to stop the program.
 **/
public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        double average = 0;
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter any integer: ");
            number = sc.nextInt();
            sum+= number;
            count++;

        }while (number != 0);

        average = sum / count;
        System.out.format("""
                Sum:        %d
                Average:    %.2f""", sum,average);
    }
}
