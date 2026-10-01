package Chapter4;

import java.util.Arrays;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 **/
public class MethodOverloading {
    public static void main(String[] args) {

        System.out.format("""
                Sum (Collection):       %d
                Sum (Two Integers):     %d
                Sum (Three Integers):   %d
                Sum (Doubles):          %.2f
                Sum (Float):            %.2f
                """, calculateSum(5,6,9,7), calculateSum(5,6), calculateSum(5,6,7),
                calculateSum(5.5, 6.3), calculateSum(3.63f, 5.38f));
    }
    /**
     * This method calculate and return the sum of two integers
     * @param x First integer value
     * @param y Second integer value
     * @return The sum of two integers
     */
    static int calculateSum(int x, int y){
        return x + y;
    }

    /**
     * Calculate and return the sum of two double values
     * @param x First double value
     * @param y Second double value
     * @return The sum of two doubles
     */
    static double calculateSum(double x, double y){
        return x + y;
    }

    /**
     * Calculate and return the sum of two floating point values
     * @param x First floating point value
     * @param y Second floating point value
     * @return The sum of two floating point values
     */
    static float calculateSum(float x, float y){
        return x + y;
    }

    /**
     * Calculate and return the sum of three integers
     * @param r First integer
     * @param x Second integer
     * @param y Third integer
     * @return The sum of three integers
     */
    static int calculateSum(int r, int x, int y){
        return r + x + y;
    }

    /**
     * Calculate and return the sum of any number of integers
     * @param numbers Collection of integers
     * @return The sum of all integers in a collection
     */
    static int calculateSum(int... numbers){
        return Arrays.stream(numbers).sum();
    }



}
