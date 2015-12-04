/**
 * Created by emanuel on 11/11/15.
 */
public class NaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
