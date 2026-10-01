package Chapter5;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 **/
public class ArrayInitialization {
    public static void main(String[] args) {
        int[] arNumbers = new int[]{52, 15, 32, 74, 25, 83, 108};
        String[] arNames = new String[]{"Kate", "Mike", "Carol", "David"};
        double[] arPrices = new double[]{22.55, 52.74, 20.0, 52.99, 75.99};
        double[] arSales = {5000.00, 7500.00, 5500.00, 2500.5};

        System.out.println("===============Numbers====================");
        for (int i = 0; i <= arNumbers.length - 1; i++) {
            System.out.print(arNumbers[i] + "  |  ");
        }

        System.out.println("\n===============Names====================");
        int index = 0;
        while (index < arNames.length){
            System.out.println(arNames[index]);
            index++;
        }

        System.out.println("\n===============Prices====================");
        double price;
        for (int i = 0; i < arPrices.length; i++) {
            price = arPrices[i];
            System.out.print(price + "   |   ");
        }

        System.out.println("\n\n===============Sales====================");
        System.out.println("old sale\tNew sale");
        double newSale;
        for (double sale : arSales){
            newSale = sale + (sale * 0.1);
           // System.out.println(sale + "\t\t" + newSale);
            System.out.format("""
                    %.2f        %.2f %n""", sale,newSale);
        }
    }
}
