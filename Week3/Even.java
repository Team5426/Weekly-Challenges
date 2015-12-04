/**
 * Created by emanuel on 11/11/15.
 */
public class Even {
    public static void main(String[] args) {
        int sum = 2;
        final int LIMIT = 4000000;
        boolean limitReached = false;
        int lastFib = 1;
        int currentFib = 2;
        int newFib = 0;

        while (!limitReached) {
            newFib = currentFib + lastFib;

            if (newFib > LIMIT) {
                limitReached = true;
            }
            else {
                sum += (newFib%2 == 0) ? newFib : 0 ;
            }

            lastFib = currentFib;
            currentFib = newFib;
        }

        System.out.println(sum);

    }
}
