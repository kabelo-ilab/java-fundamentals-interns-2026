package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class ExploreOperators {
    public static void main(String[] args) {
        int a, b;
        //Assignment
        //Assign
        a = 5;
        b = 15;
        System.out.println("-----Assign-----");
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
        //add and assign
        a += 5;
        b += 2;
        System.out.println("-----Add and Assign-----");
        System.out.println("Current Value of a: " + a);//10
        System.out.println("Current Value of b: " + b);//17

        //subtract and assign
        a -= 3;
        b -= 6;
        System.out.println("-----Subtract and Assign-----");
        System.out.println("Current Value of a: " + a);//7
        System.out.println("Current Value of b: " + b);//11

        //multiply and assign
        a *= 2;
        b *= 3;
        System.out.println("-----Multiply and Assign-----");
        System.out.println("Current Value of a: " + a);//14
        System.out.println("Current Value of b: " + b);//33

        //divide and assign
        a /= 7;
        b /= 6;
        System.out.println("-----Divide and Assign-----");
        System.out.println("Current Value of a: " + a);//2
        System.out.println("Current Value of b: " + b);//5.5 ~6

    }
}
