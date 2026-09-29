package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 4;

        //pre-increment
        System.out.println("Current value of x: " + x);
        System.out.println("Pre-increment: " + ++x);//5

        x = 25;
        //pre-decrement
        System.out.println("Current value of x: " + x);//25
        System.out.println("Pre-decrement: " + --x);//24
        System.out.println("Value after pre-decrement " + x);//24

        System.out.println("========================");

        x = 16;

        //post-increment
        System.out.println("Current value of x: " + x);//16
        System.out.println("post-increment: " + x++);//16
        System.out.println("Value after post-increment " + x);//17

        System.out.println("========================");
        x *= 2;
        //post-decrement
        System.out.println("Current value of x: " + x);//34
        System.out.println("post-decrement: " + x--);//34
        System.out.println("Value after post-decrement " + x);//33

    }
}
