package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class NestedIFStatement {
    public static void main(String[] args) {
        int creditScore = 500;
        double salary = 15000;
        boolean employmentStatus = true;
        String feedback = "Declined";

        if (employmentStatus){
            if (salary >= 15000){
                if (creditScore >= 600){
                    feedback = "Approved";
                } else if (creditScore >= 500 && creditScore <= 599) {
                    feedback = "Approved with exception";
                }else{
                    feedback = "Declined (Low credit score)";
                }
            }else{
                feedback = "Declined: You need to earn at least R15 000.00";
            }
        }else{
            feedback = "Declined: You need to be employed";
        }

        System.out.println("Feedback: " + feedback);
    }
}
