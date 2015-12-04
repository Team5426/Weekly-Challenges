import java.util.Scanner;

/**
 * Created by emanuel on 12/2/15.
 */
public class Validation {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String prompt = "Pick a number between 0 and 10";
        String notANumber = "That's not even a number!";
        int input;

        do {
            System.out.println(prompt);

            while (!keyboard.hasNextInt()){
                System.out.println(notANumber);
                keyboard.next();
            }

            input = keyboard.nextInt();
        } while (input < 0 || input > 10);

        System.out.println("Thanks! You said " + input);

    }
}
