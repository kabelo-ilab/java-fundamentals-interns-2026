package Chapter1;

import java.util.Scanner;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/28
 * Get input from the user using scanner object
 **/
public class UserInput {
    public static void main(String[] args) {
        //declare
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);
        //assign
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter height: ");
        height = sc.nextDouble();
        //use
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

    }
}
