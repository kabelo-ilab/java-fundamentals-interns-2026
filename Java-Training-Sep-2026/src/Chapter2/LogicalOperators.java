package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 5, b = 25;
        boolean c = false;
        //equality
        System.out.println(a == b && c);//false
        //not equal
        System.out.println((a != b) || (a < b));//true
        //greater than
        System.out.println(a > ( b / 3 ));//false
        //less than
        System.out.println((b > a) || (c));//true

        System.out.println(    !(a >= (b / 5))   );//false
                        //      false
        System.out.println(    !(a < b) && (b == 5) || !c   );//true
    }
}
