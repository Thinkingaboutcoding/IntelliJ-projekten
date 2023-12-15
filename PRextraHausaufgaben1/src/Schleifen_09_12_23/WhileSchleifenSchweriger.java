package Schleifen_09_12_23;

public class WhileSchleifenSchweriger {
    public static void main(String[] args) {
        calculateSumOfInverseSquareRoots();
        findLargestDigit();
        findSmallestNumberDivisibleBy71113();
        convertBinaryToDecimal();
        countDigitsInPowerOfTwo();
    }

    private static void calculateSumOfInverseSquareRoots() {
        int n = 1;
        double sumOfInverseSquareRoots = 0;
        while (n <= 10) {
            sumOfInverseSquareRoots += 1 / Math.sqrt(n);
            n++;
        }
        System.out.println("Summe der inversen Quadratwurzeln von 1 bis 10: " + sumOfInverseSquareRoots);
    }

    private static void findLargestDigit() {
        int number = 874593;
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Größte Ziffer der Zahl 874593: " + largestDigit);
    }

    private static void findSmallestNumberDivisibleBy71113() {
        int smallestNumber = 1;
        while (!(smallestNumber % 7 == 0 && smallestNumber % 11 == 0 && smallestNumber % 13 == 0)) {
            smallestNumber++;
        }
        System.out.println("Kleinste Zahl, die durch 7, 11 und 13 teilbar ist: " + smallestNumber);
    }

    private static void convertBinaryToDecimal() {
        String binaryString = "101010";
        int decimalResult = 0;
        int power = 0;
        int index = binaryString.length() - 1;
        while (index >= 0) {
            int digit = Character.getNumericValue(binaryString.charAt(index));
            decimalResult += digit * Math.pow(2, power);
            power++;
            index--;
        }
        System.out.println("Dezimaldarstellung von Binärzahl '101010': " + decimalResult);
    }

    private static void countDigitsInPowerOfTwo() {
        int exponent = 1000;
        long powerOfTwo = 1;
        int digitCount = 0;
        while (exponent > 0) {
            powerOfTwo *= 2;
            exponent--;
        }
        while (powerOfTwo > 0) {
            powerOfTwo /= 10;
            digitCount++;
        }
        System.out.println("Anzahl der Ziffern in der Zahl 2^1000: " + digitCount);
    }
}
