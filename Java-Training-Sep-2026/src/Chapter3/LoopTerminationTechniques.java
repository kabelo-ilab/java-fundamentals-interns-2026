package Chapter3;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/30
 * break: end / exit the loop
 * continue: will skip the current iteration and start the iteration
 **/
public class LoopTerminationTechniques {
    public static void main(String[] args) {
        //break
        System.out.println("=====Break=====");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + "  |  ");//4
        }

        //continue
        System.out.println("\n=====Continue=====\n");
        for (int i = 1; i <= 15; i++) {
            if (i %3 == 0) continue;
            System.out.print(i + "  |  ");//1, 2, 4, 5, 7, 8, 10, 11, 13, 14
        }

        System.out.println("\n=====Continue + Break=====\n");
        for (int i = 0; i <= 15; i++) {
            if (i == 5) break;
            if (i == 3) continue;
            System.out.print(i + "  |  ");//0, 1, 2, 4,
        }

    }
}
