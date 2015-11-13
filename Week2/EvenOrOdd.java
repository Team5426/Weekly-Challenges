import java.util.Scanner;

/**
 * Created by emanuel on 11/13/15.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = keyboard.nextInt();

        if (input%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
