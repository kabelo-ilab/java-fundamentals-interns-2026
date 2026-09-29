package Chapter2;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Training-Sep-2026
 * Date   : 2026/09/29
 **/
public class SwitchStatement {
    public static void main(String[] args) {
        String module = "C#";
        String lecturer;
        //Smith (Java, SQL), Carol (C#, VB) James (Python, JavaScript, TypeScript)

        switch (module){
            case "Java":
                case "SQL" : lecturer = "Smith";
            break;
            case "C#" :
            case "VB" : lecturer = "Carol";
            break;
            case "Python":
            case "JavaScript":
            case "TypeScript": lecturer = "James";
            break;
            default: lecturer = "Invalid Module";
        }
        System.out.println("Lecturer for module " + module + " is " + lecturer);
    }
}
