import java.util.Scanner;

/**
 * Created by emanuel on 11/13/15.
 */
public class TimHortons {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("###Menu###\n" +
                "1. Timbits\n" +
                "2. Hot Chocolate\n" +
                "3. Ice Capp\n" +
                ">> ");

        int choice = keyboard.nextInt();

        final double TIMBIT_PRICE = 0.10;
        final double SMALL_CHOCOLATE = 2.10;
        final double MED_CHOCOLATE = 2.50;
        final double LARGE_CHOCOLATE = 3.00;
        final double SMALL_ICECAPP = 3.00;
        final double MED_ICECAPP = 3.50;
        final double LARGE_ICECAPP = 4.00;

        double totalCost = 0;

        if (choice == 1) {
            System.out.print("How many would you like? ");
            int amount = keyboard.nextInt();
            totalCost = amount * TIMBIT_PRICE;
        } else if (choice == 2){
            System.out.print("What size would you like?\n" +
                    "1. Small\n" +
                    "2. Medium\n" +
                    "3. Large\n" +
                    ">> ");
            int size = keyboard.nextInt();

            if (size == 1)
                totalCost = SMALL_CHOCOLATE;
            else if (size == 2)
                totalCost = MED_CHOCOLATE;
            else if (size == 3)
                totalCost = LARGE_CHOCOLATE;

        } else if (choice == 3) {
            System.out.print("What size would you like?\n" +
                    "1. Small\n" +
                    "2. Medium\n" +
                    "3. Large\n" +
                    ">> ");
            int size = keyboard.nextInt();

            if (size == 1)
                totalCost = SMALL_ICECAPP;
            else if (size == 2)
                totalCost = MED_ICECAPP;
            else if (size == 3)
                totalCost = LARGE_ICECAPP;
        } else {
            System.out.println("Oops you didn't order anything");
        }

        System.out.printf("Your order comes out to: $%.2f",totalCost);

    }
}
