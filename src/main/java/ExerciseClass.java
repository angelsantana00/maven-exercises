import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class ExerciseClass {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter Something:");
        String enterKey = readInput.nextLine();
        System.out.print( "You Entered : "+ "\""   + enterKey + "\"");
        boolean checker =  StringUtils.isNumeric(enterKey);
        if (!checker) {
            System.out.println("\n" + "\"" + enterKey + "\"" + "  is not a number.");
        }else {
            System.out.println("\t" + enterKey + "  is a number.");
        }

        System.out.println("Swaps: " + StringUtils.swapCase(enterKey));
        System.out.println("Reverse: " + StringUtils.reverse(enterKey));
    }
}