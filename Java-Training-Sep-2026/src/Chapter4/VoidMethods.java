package Chapter4;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 * Void Methods
 **/
public class VoidMethods {
    public static void main(String[] args) {

        displayMessage();
        System.out.println("=============================");
        displayAddress();
    }

    static void displayMessage(){
        System.out.println("Hi, welcome to Java training");
    }

    public static void displayAddress(){
        System.out.println("""
                123 Main Street
                Rivonia
                Sandton
                0123""");
    }


}
