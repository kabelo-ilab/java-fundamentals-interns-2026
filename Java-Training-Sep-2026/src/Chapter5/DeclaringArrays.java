package Chapter5;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 * Declare, assign and use Array elements
 **/
public class DeclaringArrays {
    public static void main(String[] args) {
        //declare
        int[] arNumbers = new int[5];
        String[] arNames = new String[3];
        double[] arPrices = new double[3];

        //assign
        arNumbers[0] = 5;
        arNumbers[2] = 6;
        arNumbers[3] = 8;
        arNumbers[1] = 52;
        arNumbers[4] = 26;

        arNames[0] = "James";
        arNames[1] = "Carol";
        arNames[2] = "Mike";

        arPrices[0] = 25.63;
        arPrices[1] = 17.33;
        arPrices[2] = 2.50;

        //use
        System.out.println(arNames[0]);
        System.out.println(arNumbers[3]);
        System.out.println(arPrices[1]);



    }
}
