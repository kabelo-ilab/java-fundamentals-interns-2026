package Chapter6;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/10/01
 **/
public class Calculator {

    static double average;
    static double sum;
    public static void main(String[] args) {
        sum = calcSum(1,2,3,4);//10
        average = calcAverage(1,2,3);//2
        printResults();
    }

    static double calcAverage(double... numbers){
        double total = 0;
        int count = numbers.length;

        for (double num : numbers){
            total += num;
        }
        average = total / count;
        return average;
    }

    static double calcSum(double... numbers){
        double total = 0;
        for (double num : numbers){
            total+=num;
        }
        return total;
    }

    static void printResults(){
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
