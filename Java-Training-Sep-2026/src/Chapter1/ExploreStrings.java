package Chapter1;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/28
 **/
public class ExploreStrings {
    public static void main(String[] args) {
        String sentence = "In Java, variables must be declared before they can be used.";
        //Number of characters
        System.out.println("Length: " + sentence.length());
        //Position of v
        System.out.println("Position: " + sentence.indexOf("a", 5, 10));//6
        //Character at a position (10)
        System.out.println("10th position has: " + sentence.charAt(10));
        //Last position of 'a' from position 15
        System.out.println("Position: " + sentence.lastIndexOf("a", 15));

    }
}
