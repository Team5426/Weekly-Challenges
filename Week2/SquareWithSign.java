import java.util.Scanner;

/**
 * Created by emanuel on 11/13/15.
 */
public class SquareWithSign {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number to square: ");
        double input = keyboard.nextDouble();
        double squaredNumber;

        if (input >= 0)
            squaredNumber = Math.pow(input, 2);
        else
            squaredNumber = -1 * Math.pow(Math.abs(input), 2);

        System.out.println("The squared number is " + squaredNumber);
    }
}
