package Chapter3;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 * WHILE Loop will continue to run untill the condition is false
 **/
public class WhileLoop {
    public static void main(String[] args) {
        //Display Java 5 times
        int x = 6;

        while (x %3 == 0){
            System.out.println(x + " - Java");
            x+=2;
        }
        //

        System.out.println("End");
    }
}
