package Chapter3;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 * Use a FOR Loop when you know the of times the loop should execute
 **/
public class ForLoop {
    public static void main(String[] args) {
        //Display Java 5 times
        //single condition
        System.out.println("===========Single Condition=============");
        for(int x = 1; x <= 5; x++){
            System.out.println(x + " - Java");
        }
        //multiple conditions
        System.out.println("===========Multiple Conditions=============");
        for(int x = 1, y = 10; x <= 5; x++, y--){
            System.out.println(x + " ---- " + y);
        }

        System.out.println("===========Compound Condition=============");
        for(int x = 1, y = 10; x <= 5 || y == 3; x++, y--){
            System.out.println(x + " ---- " + y);
        }
    }
}
