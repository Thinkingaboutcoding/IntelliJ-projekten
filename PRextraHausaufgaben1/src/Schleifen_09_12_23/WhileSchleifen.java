package Schleifen_09_12_23;

import java.util.ArrayList;
import java.util.List;

public class WhileSchleifen {
    public static void main(String[] args) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> sumResult = new ArrayList<>();
        List<Integer> powersOfTwo = new ArrayList<>();
        List<Integer> countDown = new ArrayList<>();
        List<Integer> multiplicationResult = new ArrayList<>();

        int i = 1;
        while (i <= 15) {
            oddNumbers.add(i);
            i += 2;
        }

        int sum = 0;
        int j = 5;
        while (j <= 15) {
            sum += j;
            j++;
        }
        sumResult.add(sum);

        int exponent = 0;
        while (exponent <= 4) {
            powersOfTwo.add((int) Math.pow(2, exponent));
            exponent++;
        }

        int countdownValue = 20;
        while (countdownValue >= 10) {
            countDown.add(countdownValue);
            countdownValue -= 3;
        }

        int product = 1;
        int k = 1;
        while (k <= 3) {
            product *= k;
            multiplicationResult.add(product);
            k++;
        }

        System.out.println("Ungerade Zahlen von 1 bis 15: " + oddNumbers);
        System.out.println("Summe der Zahlen von 5 bis 15: " + sumResult);
        System.out.println("Potenzen von 2 (2^0 bis 2^4): " + powersOfTwo);
        System.out.println("Zähle von 20 bis 10 in Schritten von 3: " + countDown);
        System.out.println("Multiplikation der Zahlen von 1 bis 3: " + multiplicationResult);
    }
}
