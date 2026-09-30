package Chapter2.Exercises;

import java.util.Scanner;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 **/
public class RoomPrice {
    public static void main(String[] args) {
        final double QUEEN_BED_PRICE = 125;
        final double KING_BED_PRICE = 139;
        final double SUITE_BED_PRICE = 165;
        String bedChoice;
        int viewChoice;
        double additionalPrice;
        double roomPrice;
        double totalCost;
        Scanner input = new Scanner(System.in);

        System.out.println("""
                A - Queen
                B - King
                C - King with a couch""");

        bedChoice = input.next();

        if (bedChoice.equalsIgnoreCase("a") || bedChoice.equalsIgnoreCase("b") ||
                bedChoice.equalsIgnoreCase("c")){

            System.out.print("""
                    1 - Lake View
                    2 - Park View:
                    """);
            viewChoice = input.nextInt();
            if (viewChoice == 1 || viewChoice == 2){

                String strView = "Park View";

                if (viewChoice == 1) {
                    additionalPrice = 15;
                    strView = "Lake View";
                } else {
                    additionalPrice = 0;
                }

                String roomType = "Suite";

                switch (bedChoice){
                    case "A" :
                        roomPrice = QUEEN_BED_PRICE;
                        roomType = "Queen";
                        break;
                    case "B" :
                        roomPrice = KING_BED_PRICE;
                        roomType = "King";
                        break;
                    default: roomPrice = SUITE_BED_PRICE;
                }

                totalCost = roomPrice + additionalPrice;

                System.out.format("""
                        Bed Type:           %s
                        Room Price:         %.2f (+ %.2f)
                        View Type:          %s
                        Total Cost:         %.2f""", roomType, roomPrice, additionalPrice,
                        strView, totalCost);

            }else{
                System.out.println("Invalid view option");
            }
        }else {
            System.out.println("Invalid bed choice");
        }


    }
}
