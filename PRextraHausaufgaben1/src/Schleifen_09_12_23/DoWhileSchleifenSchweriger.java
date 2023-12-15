package Schleifen_09_12_23;

public class DoWhileSchleifenSchweriger {
    public static void main(String[] args) {
        sumOfSquares();
        countEvenDigits();
        findLargestPrimeUnder1000();
        convertHexadecimalToDecimal();
        findSmallestNumberDivisibleBy357();
    }

    private static void sumOfSquares() {
        int sumOfSquares = 0;
        int num1 = 1;
        do {
            sumOfSquares += num1 * num1;
            num1++;
        } while (num1 <= 10);
        System.out.println("Sum of squares of numbers from 1 to 10: " + sumOfSquares);
    }

    private static void countEvenDigits() {
        int numberToCount = 876245;
        int evenDigitCount = 0;
        int num2 = numberToCount;
        do {
            int digit = num2 % 10;
            if (digit % 2 == 0) {
                evenDigitCount++;
            }
            num2 /= 10;
        } while (num2 > 0);
        System.out.println("Number of even digits in " + numberToCount + ": " + evenDigitCount);
    }

    private static void findLargestPrimeUnder1000() {
        int largestPrimeUnder1000 = 997; // Initializing with the largest known prime under 1000
        do {
            largestPrimeUnder1000 -= 2; // Start checking from the next odd number
        } while (!isPrime(largestPrimeUnder1000));
        System.out.println("Largest prime number under 1000: " + largestPrimeUnder1000);
    }

    private static void convertHexadecimalToDecimal() {
        String hexadecimalNumber = "1A";
        int decimalResult = 0;
        int power = 0;
        int index = hexadecimalNumber.length() - 1;
        do {
            int digit = Character.digit(hexadecimalNumber.charAt(index), 16);
            decimalResult += digit * Math.pow(16, power);
            power++;
            index--;
        } while (index >= 0);
        System.out.println("Decimal representation of hexadecimal '1A': " + decimalResult);
    }

    private static void findSmallestNumberDivisibleBy357() {
        int smallestNumber = 1;
        do {
            smallestNumber++;
        } while (smallestNumber % 3 != 0 || smallestNumber % 5 != 0 || smallestNumber % 7 != 0);
        System.out.println("Smallest number divisible by 3, 5, and 7: " + smallestNumber);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
