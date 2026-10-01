package Chapter5;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 **/
public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] arStudents = new String[]{"John", "Kate", "Jessica", "Lerato", "Carol"};
        int[][] arTestScores = new int[][]{
                {74, 63, 70},//row1 John - 0
                {69, 74, 59},//row2 Kate - 1
                {85, 90, 73},//row3 Jessica - 2
                {78, 87, 94},//row4 Lerato - 3
                {96, 74, 81}//row5 Carol - 4
        };

        System.out.println("Name\tTest 1\tTest 2\tTest 3" +
                "\n----------------------------------");
        for (int row = 0; row < arTestScores.length; row++) {
            System.out.print(arStudents[row] + "\t");

            for (int col = 0; col < arTestScores[row].length; col++) {
                System.out.print(arTestScores[row][col] + "\t\t");
            }
            System.out.println();
        }

    }
}
