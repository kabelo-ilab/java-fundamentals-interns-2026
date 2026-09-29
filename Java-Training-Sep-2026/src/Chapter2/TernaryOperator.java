package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? trueResults : falseResults
        int age = 15, number = 19;
        String feedback;

        //variable = condition ? trueResults : falseResults
        feedback = (age >= 18) ? "You can vote" : "Sorry, you cannot vote.";

        feedback = (number %2 == 0) ? "even" :
                (number %3 == 0) ? "multiple of 3" : "odd";

        System.out.println(feedback);
    }
}
